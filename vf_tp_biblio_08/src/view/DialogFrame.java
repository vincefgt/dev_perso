package view;

import javax.swing.*;
import java.awt.event.*;

public class DialogFrame extends JDialog {
    public static boolean Result;
    private JPanel contentPane2;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JLabel textLabel;

    public DialogFrame(String pTextLabel) {
        setContentPane(contentPane2);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        this.setTextLabel(pTextLabel);
        this.setLocationRelativeTo(null);
        this.setTitle("CONFIRM DELETE BOOK");

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane2.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        Result = true;
        dispose();
    }
    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void setTextLabel(String pTextLabel) {
        this.textLabel.setText(pTextLabel);
    }

    public static boolean getResult() {
        return Result;
    }
    public static void confirmButton(String pTextLabel,boolean bCancel,boolean bOK) {
        DialogFrame dialog = new DialogFrame(pTextLabel,bCancel,bOK);
        dialog.buttonCancel.setVisible(bCancel);
        dialog.buttonOk.setVisible(bOk);
        dialog.pack();
        dialog.setVisible(true);
       // System.exit(0);
    }

    public static void main(String[] args) {
        DialogFrame dialog = new DialogFrame("ToEdit");
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
