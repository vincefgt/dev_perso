package model;

import utilities.Regex;
import view.InputAndDisplay;

import java.time.LocalDate;
import java.util.*;

public class Book extends Author {
    private String title;
    private int stock = 0;
    private long isbn;
    private LocalDate borrowDate = null;
    private LocalDate returnDate = null;

    public Book(String firstNameAuthor, String lastNameAuthor, String title, int stock, long isbn, LocalDate borrowDate, LocalDate returnDate) {
        super(firstNameAuthor, lastNameAuthor);
        this.setTitle(title);
        this.setStock(stock);
        this.setIsbn(isbn);
        this.setBorrowDateIn(borrowDate);
        this.setReturnDate(returnDate);
        Book.listBooks.add(this);
        Book.MapIsbnBook.put(String.valueOf(getIsbn()),this);
    }

    /**
     * Lists
     */
    static List<Book> listBooks = new ArrayList<>();
    static List<Book> listBooksBorrowed = new ArrayList<>();
    public static Map<String, Book> MapIsbnBook = new HashMap<>();

    /**
     * Getter/Setter
     */
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        do{
            String paramRegex = "^\\d{1,3}$";
            Regex.setParamRegex(paramRegex);
            if (Regex.testDigit(stock) || Regex.testEmptyBlank(String.valueOf(stock))){
                InputAndDisplay.error("Invalid Stock[3 numbers max]");
            }
        } while (Regex.testDigit(stock));
        this.stock = stock;
    }
    public long getIsbn() {
        return this.isbn;
    }
    public void setIsbn(long isbn) {
        do{
        String paramRegex = "^(?:\\d){13}$";
        Regex.setParamRegex(paramRegex);
        if (Regex.testDigit(isbn) || Regex.testEmptyBlank(String.valueOf(isbn))){
            InputAndDisplay.error("Invalid isbn[13 numbers]");
        }
    } while (Regex.testDigit(isbn));
     this.isbn = isbn;
    }
    public LocalDate getBorrowDateIn() {
        return borrowDate;
    }
    public void setBorrowDateIn(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
        setReturnDate(this.borrowDate);
    }
    public void setReturnDate(LocalDate borrowDate) {
        if (borrowDate!=null) {
        returnDate = this.borrowDate.plusDays(7);}
    }
    public LocalDate getReturnDate() {
        return this.returnDate;
    }

    /**
     * getLists
     */
    public static List<Book> getListBooks() {
        return listBooks;
    }
    public static List<Book> getListBooksBorrowed() {
        return listBooksBorrowed;
    }

    @Override
    public String toString() {
        return "Book{ " + title +" } Author{ "+super.toString()+" }";
    }

}
