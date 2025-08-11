package mmorpg.controler;

import mmorpg.model.Classes;
import mmorpg.model.Person;
import mmorpg.model.Race;

public class Mmorpg {
    public static void main(String[] args) {

        Mmorpg main = new Mmorpg();
        main.run();
    }

    public void run() {


        Race gnome = new Race("gnome");
        Race elfe = new Race("elfe");
        Race human = new Race("human");

        Classes thief = new Classes("thief");
        Classes warrior = new Classes("warrior");
        Classes healer = new Classes("healer");

        Person person = new Person("john", 1, 100, null, thief);
        System.out.println(person);

    }

    /*@Override
        public String  toString(){
            return this.person;
        }*/

}
