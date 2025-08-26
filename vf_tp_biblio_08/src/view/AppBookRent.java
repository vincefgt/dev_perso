package view;

import model.Author;
import model.Book;
import model.Subscriber;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppBookRent extends JFrame {

    private JPanel contentPane;
    private JPanel Lists;
    private JPanel menu;
    private JLabel title;
    private JScrollPane scrollListBook;
    private JPanel titleFrame;
    private JList<String> listBook;
    private JButton BOOKButton;
    private JButton SUBButton;
    private JButton AUTHORButton;
    private JButton BORROWButton;
    private JList<String> listAuthor;
    private JScrollPane scrollListAuthor;
    private JScrollPane scrollListSub;
    private JList<String> listSub;
    private JTextArea byVinceFgtTextArea;
    private JTextArea v100TextArea;
    private JScrollPane scrollListBorrow;
    private JList listBorrow;
    private JTextField inputTitle;
    private JPanel bookPane;
    private JTextPane textTitle;
    private JPanel inputBook;
    private JTextPane textStock;
    private JTextField inputStock;
    private JEditorPane textIsbn;
    private JTextField inputIsbn;
    private JTextPane textFirstName;
    private JTextField textField1;
    private String titleBorder;

    private final String[] AttAuthor = new String[]{"FirstName", "LastName"};

    //Constructor
    public AppBookRent() {
        Dimension dimension = new Dimension(1000, 600);

        this.setTitle("BOOKRENT");
        /**
         *         Mise en place de l'action de la croix par défaut
         */
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // taille de la fenetre
        this.setPreferredSize(dimension);
        // ajout du contentPane à la fenetre
        this.setContentPane(contentPane);
        // redimensionnement interdit
        this.setResizable(false);
        // Set the frame location to the center of the screen
        //this.setLocationRelativeTo(null);
        this.setLocation(400, 250);
        // création de la fenêtre
        this.pack();
        this.setVisible(true);
        DataListAuthors();
        DataListBooks();
        DataListSubscribers();
        DataListBorrow();

        this.bookPane.setVisible(true); // setup by default

        AUTHORButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){actionAuthorButton();}
        });
        BOOKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){actionBookButton();}
        });
        SUBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){actionSubButton();}
        });
        BORROWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){actionBorrowButton();}
        });
    }

    /**
     * Create list swing
     * Authors
     * Borrow
     * Books
     * Subscribers
     */
    public void DataListAuthors() {
        DefaultListModel<String> modelAuthor = new DefaultListModel<>();
        for (Author author : Author.getListAuthors()) {
            modelAuthor.addElement(author.getFirstNameAuthor() + " " + author.getLastNameAuthor());
        }
        this.listAuthor.setModel(modelAuthor);
        String titleBorder = "(" + modelAuthor.size() + ")";
        this.scrollListAuthor.setBorder(setupBorderScroll(titleBorder));
    }
    public void DataListBorrow() {
        DefaultListModel<String> modelBorrow = new DefaultListModel<>();
        for (Book bkb : Book.getListBooksBorrowed()) {
            modelBorrow.addElement(bkb.getTitle());
        }
        this.listBorrow.setModel(modelBorrow);

        if (modelBorrow.isEmpty()){
            titleBorder = "(empty)";
        } else {
            titleBorder = "(" + modelBorrow.size() + ")"; }
        this.scrollListBorrow.setBorder(setupBorderScroll(titleBorder));
    }
    public void DataListBooks() {
        DefaultListModel<String> modelBook = new DefaultListModel<>();
        for (Book bk : Book.getListBooks()) {
            modelBook.addElement(bk.toString()+" / "+bk.getStock());
        }
        this.listBook.setModel(modelBook);
        String titleBorder = "(" + modelBook.size() + ")";
        this.scrollListBook.setBorder(setupBorderScroll(titleBorder));

    }
    public void DataListSubscribers() {
        DefaultListModel<String> modelSub = new DefaultListModel<>();
        for (Subscriber subs : Subscriber.getListSubscriber()) {
            modelSub.addElement(subs.toString());
        }
        this.listSub.setModel(modelSub);
        String titleBorder = "(" + modelSub.size() + ")";
        this.scrollListSub.setBorder(setupBorderScroll(titleBorder));

    }

    /**
     * ActionButton
     * author
     * borrow
     * books
     * sub
     */
    private void actionAuthorButton(){
        allListHide();
        this.scrollListAuthor.setVisible(true);
        this.contentPane.revalidate();
    }
    private void actionBorrowButton(){
        allListHide();
        this.scrollListBorrow.setVisible(true);
        this.contentPane.revalidate();
    }
    private void actionBookButton(){
        allListHide();
        this.bookPane.setVisible(true);
        this.contentPane.revalidate();
    }
    private void actionSubButton(){
        allListHide();
        this.scrollListSub.setVisible(true);
        this.contentPane.revalidate();
    }

    /**
     * param extra
     */
    private void allListHide(){
        this.bookPane.setVisible(false);
        this.scrollListBorrow.setVisible(false);
        this.scrollListSub.setVisible(false);
        this.scrollListAuthor.setVisible(false);
    }
    public Border setupBorderScroll(String titleBorder) {
        TitledBorder border = BorderFactory.createTitledBorder(titleBorder);
        border.setBorder(BorderFactory.createEmptyBorder());
        border.setTitleJustification(TitledBorder.LEFT);
        border.setTitlePosition(TitledBorder.TOP);
        border.setTitleFont(new Font("", Font.BOLD, 16));
        border.setTitleColor(new Color(229, 195, 183));
        return border;
    }

}
