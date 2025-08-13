package mmorpg.controler;

import mmorpg.model.*;
import mmorpg.vue.actionDisplay;

import java.util.HashMap;
import java.util.Map;

import static mmorpg.model.Warrior.createListWarrior;
import static mmorpg.vue.actionDisplay.*;

public class Mmorpg {
    public static void main(String[] args) {

        Mmorpg main = new Mmorpg();
        main.run();
    }

    public void run() {
        /*Race gnome = new Race("gnome");
        Race elfe = new Race("elfe");
        Race human = new Race("human");

        Classes thief = new Classes("thief");
        Classes warrior = new Classes("warrior");
        Classes healer = new Classes("healer");

        Person p1 = new Person("john", 1, 100, "thief","elfe");*/
        initWord();
        actionDisplay.displayNewPerson();
        //seize data person
        //displayCreatePerson();
        //createPerson();
//        displayListWarrior();
//        displayListHealer();
//        displayListThief();
        //displayNewPerson();


    }

    // create person
    public static void createPerson(String autoName,Race controlRaceAuto,Classes autoClasses) {

        Classes controlClasses;
        String controlName;
        Race controlRace;


        //permit add init manuel
        if (actionDisplay.getRace() == null) {
            controlRace = controlRaceAuto; }
        else { controlRace = actionDisplay.getRace(); }

        if (actionDisplay.getClasses() == null) {
            controlClasses = autoClasses; }
        else { controlClasses = actionDisplay.getClasses(); }

        if (actionDisplay.getName() == null) {
            controlName= autoName; }
        else { controlName = actionDisplay.getName(); }



            switch (controlRace.toString()){
                case "thief" : createThief(autoName,controlRace,autoClasses);
                break;
            case "warrior" : createWarrior(autoName,controlRace,autoClasses);
                break;
            case "healer" : createHealer(autoName,controlRace,autoClasses);
                break;
            default:
            System.out.println("[ERROR] Invalid Race Selection");
                break;
        }
    }

    public static void createThief(String autoName, Race controlRace, Classes autoClasses) {
        Thief t1 = new Thief(autoName,
                1, 100, (Race) controlRace,
                autoClasses, null,100);
        Thief.getListThief().add(t1);
        Person.getListPerson().add(t1);
    }
    public static void createWarrior(String autoName, Race controlRace, Classes autoClasses) {
        Warrior w1 = new Warrior(autoName,
                1, 100, controlRace,
                autoClasses, null,100);
        Warrior.getListWarrior().add(w1);
        Person.getListPerson().add(w1);
    }
    public static void createHealer(String autoName, Race controlRace, Classes autoClasses) {
        Healer h1 = new Healer(autoName,
                1, 100, controlRace,
                autoClasses,null,100);
        Healer.getListHealer().add(h1);
        Person.getListPerson().add(h1);;
    }

    public static void createGroup(String groupName,String person1, String person2, String person3) {
        if (Person.getListPerson().size() >= 3){
            Group g1 = new Group(groupName,person1,person2,person3);
        }
        actionDisplay.displayPersonsGroup(groupName);
        actionDisplay.displayListGroup();
        actionDisplay.displayListPerson();
    }

    private static void initWord() {
        createListWarrior();

        Race thief = new Race("thief");
        Race warrior = new Race("warrior");
        Race healer = new Race("healer");
        Race.getRace().put("thief",thief);
        Race.getRace().put("warrior",warrior);
        Race.getRace().put("healer",healer);

        Classes gnome = new Classes("gnome");
        Classes humain = new Classes("humain");
        Classes elfe = new Classes("elfe");
        Classes.getClasses().put("gnome",gnome);
        Classes.getClasses().put("humain",humain);
        Classes.getClasses().put("elfe",elfe);


        createPerson("john",healer,elfe);
        createPerson("guy",thief,humain);
        createPerson("lois",warrior,humain);

        displayListHealer();
        displayListThief();
        displayListWarrior();
    }




    /*@Override
        public String  toString(){
            return this.person;
        }*/

}
