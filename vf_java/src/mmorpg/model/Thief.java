package mmorpg.model;

import java.util.ArrayList;
import java.util.List;

public class Thief extends Person{
    private int poh = 0; //point of hability;

    public Thief(String name,  int level, int pol, String race, String classes, int poh) {
        super(name, level,pol, race,classes);
        this.setPoh(poh);
    }

    static ArrayList<Thief> listThief = new ArrayList<>();

    public int getPoh(){
        return this.poh;
    }

    public void setPoh(int poh){
        this.poh = poh;
    }

    public static ArrayList<Thief> getListThief() {
        return listThief;
    }

    @Override
    public String toString(){
        return getName() + " " + getLevel() + " " + getPol() + " " + getRace()+" "+super.toString();
    }
}

