package training.afpa.cda24060;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(">>>>>>>> Hello awesome !!");

        //create instance > class main
        Main main = new Main();
        // call methode
        //main.start();

        exo exo = new exo();
        exo.AverageNotes();
        exo.SortTab();


    }

 public class exo{
     int i = 9;
     int[] scoreboard = new int[5];
     float result = 0;
     float notes = 0;
     float key;
     float memkey;

    public void AverageNotes() { //4.1

            for (i = 0; i<scoreboard.length ; i++) {
                System.out.println("Please enter the note(" + (i + 1) + ") ?");
                Scanner scanner = new Scanner(System.in);
                notes = scanner.nextFloat();
                result = result + notes;
            }
            System.out.println("Average = " + result / scoreboard.length);
    }

    public void SortTab(){
        for (int i = 0; i < scoreboard.length ; i++) {
            key = scoreboard[i];
            memkey = i-1;
            while (key <= scoreboard[mem] && mem >= 0) {
                scoreboard[mem+1] = scoreboard[mem];
            }
            scoreboard[mem+1] = key;
        }



    }
    }
}
