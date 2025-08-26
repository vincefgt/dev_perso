package view;

import model.Author;
import model.Book;
import model.Subscriber;

import javax.swing.*;
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
        scrollListBook.setVisible(true);
        DataListSubscribers();

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



    }

    /**
     * Create list swing Authors
     */
    public void DataListAuthors() {
        DefaultListModel<String> modelAuthor = new DefaultListModel<>();
        for (Author author : Author.getListAuthors()) {
            modelAuthor.addElement(author.getFirstNameAuthor() + " " + author.getLastNameAuthor());
        }
        listAuthor.setModel(modelAuthor);
        InputAndDisplay.message(String.valueOf(modelAuthor),4);
        scrollListAuthor.setViewportView(listAuthor);
    }

    /**
     * Create list swing Book
     */
    public void DataListBooks() {
        DefaultListModel<String> modelBook = new DefaultListModel<>();
        for (Book bk : Book.getListBooks()) {
            modelBook.addElement(bk.toString()+" ("+bk.getStock()+")");
        }
        listBook.setModel(modelBook);
        InputAndDisplay.message(String.valueOf(modelBook),1);
        //scrollListBook.setViewportView(listBook);
    }

    /**
     * Create List swing Subcriber
     */
    public void DataListSubscribers() {
        DefaultListModel<String> modelSub = new DefaultListModel<>();
        for (Subscriber subs : Subscriber.getListSubscriber()) {
            modelSub.addElement(subs.toString());
        }
        listSub.setModel(modelSub);
        InputAndDisplay.message(String.valueOf(modelSub),2);
        //scrollListSub.setViewportView(listSub);
        //scrollList.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //scrollList.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    private void actionAuthorButton(){
       // DataListAuthors();
        allListHide();
        scrollListAuthor.setVisible(true);
        this.contentPane.revalidate();

    }

    private void actionBookButton(){
       // DataListBooks();
        allListHide();
        scrollListBook.setVisible(true);
        this.contentPane.revalidate();
    }

    private void actionSubButton(){
       // DataListSubscribers();
        allListHide();
        scrollListSub.setVisible(true);
        this.contentPane.revalidate();
        //this.contentPane.repaint();
    }

    private void allListHide(){
        scrollListBook.setVisible(false);
        //scrollListBorrow.setVisible(false);
        scrollListSub.setVisible(false);
        scrollListAuthor.setVisible(false);
    }

}
