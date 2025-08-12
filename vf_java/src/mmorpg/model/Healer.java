package mmorpg.model;

import java.util.ArrayList;
import java.util.List;

public class Healer extends Person{
    private int pom = 0; //point of strength;

    public Healer(String name, int level, int pol, String race, String Class, int pom) {
        super(name, level,pol, race,Class);
        this.setPom(pom);
    }

    public static ArrayList<Healer> listHealer = new ArrayList<>();

    public static List<Healer> getListHealer(){
        return listHealer;
    }

    public int getPom(){
        return this.pom;
    }

    public void setPom(int pom){
        this.pom = pom;
    }

    public static void addListHealer(Healer h){
        listHealer.add(h);
    }










}
