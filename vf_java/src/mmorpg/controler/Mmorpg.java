package mmorpg.controler;

import mmorpg.model.*;
import mmorpg.vue.actionDisplay;

import javax.swing.*;
import java.lang.classfile.instruction.SwitchCase;
import java.util.List;

import static mmorpg.model.Warrior.createListWarrior;
import static mmorpg.vue.actionDisplay.*;

public class Mmorpg {
    public static void main(String[] args) {

        Mmorpg main = new Mmorpg();
        main.run();
    }

    public void run() {

        createListWarrior();

        Race gnome = new Race("gnome");
        Race elfe = new Race("elfe");
        Race human = new Race("human");

        Classes thief = new Classes("thief");
        Classes warrior = new Classes("warrior");
        Classes healer = new Classes("healer");

        //Person person = new Person("john", 1, 100, null, thief);

        //seize data person
        displayCreatePerson();
        //createPerson();
//        displayListWarrior();
//        displayListHealer();
//        displayListThief();
        //displayNewPerson();


    }

    // create person
    public static void createPerson() {
        String controlRace = actionDisplay.getRace();
            switch (controlRace){
            case "thief": createThief();
                break;
            case "warrior": createWarrior();
                break;
            case "healer": createHealer();
                break;
            default:
            System.out.println("[ERROR] Invalid Race Selection");
                break;
    }
        actionDisplay.displayListPerson();
        actionDisplay.displayNewPerson();

    }

    public static void createThief() {
        Thief t1 = new Thief(actionDisplay.getName(),
                1, 100, actionDisplay.getRace(),
                actionDisplay.getClasses(), 100);
        Thief.getListThief().add(t1);
        Person.getListPerson().add(t1);
        displayListWarrior();
        displayListHealer();
        displayListThief();
    }
    public static void createWarrior() {
        Warrior w1 = new Warrior(actionDisplay.getName(),
                1, 100, actionDisplay.getRace(),
                actionDisplay.getClasses(), 100);
        Warrior.getListWarrior().add(w1);
        Person.getListPerson().add(w1);
        displayListWarrior();
        displayListHealer();
        displayListThief();
    }
    public static void createHealer() {
        Healer h1 = new Healer(actionDisplay.getName(),
                1, 100, actionDisplay.getRace(),
                actionDisplay.getClasses(),100);
        Healer.getListHealer().add(h1);
        Person.getListPerson().add(h1);
        displayListWarrior();
        displayListHealer();
        displayListThief();
    }

    public static void createGroup(String groupName,String person1, String person2, String person3) {
        if (Person.getListPerson().size() >= 3){
            Group g1 = new Group(actionDisplay.displayNewGroup(groupName),
                    actionDisplay.displayNewGroup(person1),
                    actionDisplay.displayNewGroup(person2),
                    actionDisplay.displayNewGroup(person3));


        }
    }



    /*@Override
        public String  toString(){
            return this.person;
        }*/

}
