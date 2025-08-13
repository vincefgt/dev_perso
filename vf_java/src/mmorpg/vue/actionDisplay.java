package mmorpg.vue;

import mmorpg.controler.Mmorpg;
import mmorpg.model.*;

import java.util.Scanner;

public class actionDisplay {

    private static String perso; // data personnage
    private static String name;
    private static Race race;
    private static Classes classes;
    private static String p1;
    private static String p2;
    private static String p3;
    private static String groupName;

    static Scanner sc = new Scanner(System.in);

    public static void displayCreatePerson(){
        System.out.println("Seize: Name / Race[thief,warrior,healer] / Classes[gnome,humain,elfe]");
        perso = sc.nextLine();
        //perso.split(" ");
        String [] caracteres = perso.split("\\s+");
        name = caracteres[0].toLowerCase();
        race = getRace.valueOf.caracteres[1].toLowerCase();
        classes = Classes.valueOf.caracteres[2].toLowerCase();

        //call create person
        //Mmorpg.createPerson();
    }

    public static String getName(){
        return name;
    }
    public static Race getRace(){
        return race;
    }
    public static Classes getClasses(){
        return classes;
    }

    public static void displayListWarrior(){
            // afficher liste
            InputAndDisplay.message("ListOfWarriors:",3);
            //System.out.println("ListOfWarriors:");
            for (Warrior w : Warrior.getListWarrior()){
                InputAndDisplay.message(String.valueOf(w),3);
            }
    }

    public static void displayListHealer(){
        InputAndDisplay.message("ListOfHealers:",4);
        //System.out.println("ListOfHealers:");
        for (Healer h : Healer.getListHealer()){
            InputAndDisplay.message(String.valueOf(h),4);
            //System.out.println(h);
        }
    }

    public static void displayListThief(){
        InputAndDisplay.message("ListOfthiefs:",2); //green
        //System.out.println("ListOfThiefs:");
        for (Thief t : Thief.getListThief()){
            InputAndDisplay.message(String.valueOf(t),2);
            //System.out.println(t);
        }
    }

    public static void displayNewPerson() {
        InputAndDisplay.message("New Person?: [y/n]",1); //green
        if (sc.nextLine().equals("y")){
           displayCreatePerson();
        } else {
        displayListHealer();
        displayListThief();
        displayListWarrior();}
        displayCreateGroup();
    }

    public static void displayListPerson(){
        InputAndDisplay.message("ListOfPersons:",0); //green
        //System.out.println("ListOfThiefs:");
        for (Person p : Person.getListPerson()){
            InputAndDisplay.message(String.valueOf(p),0);
            //System.out.println(t);
        }
    }

    public static void displayCreateGroup() {
        InputAndDisplay.message("Create Group?: [y/n]",1); //green
        if (sc.nextLine().equals("y")){
            displayListPerson();
            InputAndDisplay.message("Give Group Name",1);
            actionDisplay.groupName = sc.nextLine();
            InputAndDisplay.message("Selected 3 players",1);
            p1 = sc.nextLine();
            InputAndDisplay.message("Selected 2 players",1);
            p2 = sc.nextLine();
            InputAndDisplay.message("Selected 1 players",1);
            p3 = sc.nextLine();

            /*return groupName;
            return p1;
            return p2;
            return p3;*/
        }
        //call
        Mmorpg.createGroup(groupName,p1,p2,p3);
    }

    public static void displayPersonsGroup(String groupName){
        InputAndDisplay.message("PersonInGroup "+groupName,0); //green
        for (Group g : Group.getListPersonsGroup()){
            InputAndDisplay.message(String.valueOf(g),0);
        }
    }

    public static void displayListGroup(){
        InputAndDisplay.message("ListOfGroup:",0); //green
        for (String g : Group.getListGroup()){
            InputAndDisplay.message(String.valueOf(g),0);
        }
    }


}
