package mmorpg.model;

import java.util.ArrayList;

public class Person {
    private String name =null;
    private int level=0;
    private int pol=0; //point of live
    private String race;
    private String classes;


    public Person(String name, int level, int pol, String race, String classes) {
        this.setName(name);
        this.setLevel(level);
        this.setPol(pol);
        this.setRace(race);
        this.setClasses(classes);
    }

    static ArrayList<Person> listPerson = new ArrayList<>();

    public static ArrayList<Person> getListPerson(){
        return listPerson;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}
    public int getPol() {return pol;}
    public void setPol(int pol) {this.pol = pol;}
    public String getRace() {return race;}
    public void setRace(String race) {this.race = race;}
    public String getClasses() {return classes;}
    public void setClasses(String classes) {this.classes = classes;}



    @Override
    public String toString() {
        return this.getName() + " " + this.getLevel() + " " + this.getPol()+" "+this.getRace()+" "+this.getClasses();
    }
}
