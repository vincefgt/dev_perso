package training.afpa.cda24060;
import actionclass.actionclass;
import utils.Outils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

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
        //main.start();

        exo exo = new exo();
        //exo.AverageNotes();
        //exo.SortTab()
        exo.exo2_3();

        // exo 5
        Outils outils = new Outils();
        /*float[] scoreboard = outils.createTab(5);
        float[] scoreboardSort = outils.sortTab(scoreboard);

        System.out.println("Enter search value:");
        Scanner sc = new Scanner(System.in);
        int searchvalue = sc.nextInt();
        outils.searchValue(scoreboardSort, searchvalue);*/

    }

    public static class exo {
        int i;
        float[] scoreboard = new float[3];
        float result = 0;
        float notes = 0;
        float key;
        int memkey; //indice of memorissation

        public void AverageNotes() { //4.1

            for (i = 0; i<scoreboard.length ; i++) {
                System.out.println("Please enter the note(" + (i + 1) + ") ?");
                Scanner scanner = new Scanner(System.in);
                notes = scanner.nextFloat();
                result = result + notes;
                //save note in scoreboard
                scoreboard[i] = notes;
            }
            System.out.println("Average = " + result / scoreboard.length); // display average
            System.out.println(Arrays.toString(scoreboard)); //display scoreboard

    }

        public void exo1_2() { //2 > 3
            int sum = 1;
            int i = 1;
            int N;

            System.out.println("Number:?");
            Scanner sc = new Scanner(System.in);
            N = sc.nextInt();

//            while (i <= N) {
//                sum = sum * i;
//                i = i + 1;
//            }

//            for (int j = 0; j <= N; j++) {
//                sum = sum * j;
//            }

            do {
                sum = sum * i;
                i++;
            } while (i <= N);

            System.out.println("La factorielle de "+N+" est : "+sum);
        }

        public void exo1_3(){
        double a;
        double b;
        double c;
        double discri;
        double x1 = 0;
        double sol2 = 0;

        System.out.println("Enter a:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Enter b:");
        b = sc.nextDouble();
        System.out.println("Enter c:");
        c = sc.nextDouble();
        discri = (b*b)-4*(a*c);
        System.out.println("Le disicriminant est : "+discri);

        if (discri == 0) {
            x1 = (-b) / (2 * a);
        }
        else if (discri > 0) {
                x1 = (-b + Math.sqrt(discri))/(2*a);
                sol2 = (-b - Math.sqrt(discri))/(2*a);
                }
        System.out.println("x1 = "+x1+" et x2 = " + sol2);
        }

        public void exo1_4() {
            int x;
            int y;
            int result ;
            int indicep = 1;
            System.out.println("Enter x:");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            System.out.println("Enter y:");
            y = sc.nextInt();
            result = x;
            do {
                result = result * x;
                indicep = indicep + 1;
            } while (indicep == y);
            System.out.println(x+"^"+y+" = "+result);
        }

        public void exo1_6() {
            int indexMax = 10;
            Outils outils = new Outils();
            outils.createTab2(indexMax,2);

        }

        public void exo2_1(){
        Outils outils = new Outils();
            // Creation Tab
            float[] tab = outils.createTab();
            outils.popup(Arrays.toString(tab),"ARRAY EXO2_1");
            // Max value
            String maxValue = Float.toString(outils.maxValueTab(tab));
            outils.popup("La valeur max est "+maxValue,"ARRAY EXO2_1");
        }

        public void exo2_2(){
            Outils outils = new Outils();
            // Creation Tab
            float[] tab = outils.createTab();
            outils.popup(Arrays.toString(tab),"ARRAY EXO2_2");
            // Calcul Moy
            String moyValue = Float.toString(outils.moyValueTab(tab));
            outils.popup("La moyenne est : "+moyValue,"MOY EXO2_2");
        }

        public void exo2_3(){
            Outils outils = new Outils();
        }
    }
}


