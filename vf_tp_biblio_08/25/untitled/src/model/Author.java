package model;

import utilities.Regex;
import view.InputAndDisplay;
import java.util.ArrayList;
import java.util.List;

public class Author {
    private String firstNameAuthor;
    private String lastNameAuthor;

    public Author(String firstNameAuthor, String lastNameAuthor) {
        this.setFirstNameAuthor(firstNameAuthor);
        this.setLastNameAuthor(lastNameAuthor);
        Author.listAuthors.add(this);
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }

    public void setFirstNameAuthor(String firstNameAuthor) {
        do{
            if(Regex.testChar(firstNameAuthor)){
                InputAndDisplay.error("Enter valid firstNameAuthor[letter only]");
            }
        } while (Regex.testChar(firstNameAuthor));
        this.firstNameAuthor = firstNameAuthor;
    }

    public String getLastNameAuthor() {

        return this.lastNameAuthor;
    }

    public void setLastNameAuthor(String lastNameAuthor) {
        do{
            if(Regex.testChar(lastNameAuthor)){
                InputAndDisplay.error("Enter valid lastNameAuthor[letter only]");
            }
        } while (Regex.testChar(lastNameAuthor));
        this.lastNameAuthor = lastNameAuthor;
    }

    static List<Author> listAuthors = new ArrayList<>();

    @Override
    public String toString() {
        return getFirstNameAuthor() + " " + getLastNameAuthor();
    }
}


