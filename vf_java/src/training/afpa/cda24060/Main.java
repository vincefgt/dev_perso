package training.afpa.cda24060;
import exo_poo.Compte;
import exo_poo.TestCompte;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <action> void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(">>>>>>>> Hello awesome !!");

        //create instance > class main
        Main main = new Main();
        // call methode
        main.start();
    }

    private void start() {

        /*
        Compte c1 = new Compte(100);
        Compte c2 = new Compte(200);
        c1.deposer(20);
        c1.retirer(500);
        Compte.displayNbObjets();*/

        TestCompte test1 = new TestCompte(100);


    }
}


