package mmorpg.model;

public class Thief extends Person{
    private int poh = 0; //point of hability;

    public Thief(String name,  int level, int pol, Race race, Classes classes, int poh) {
        super(name, level,pol, race,classes);
        this.setPoh(poh);
    }

    public int getPoh(){
        return this.poh;
    }

    public void setPoh(int poh){
        this.poh = poh;
    }

    @Override
    public String toString(){
        return getName() + " " + getLevel() + " " + getPol() + " " + getRace()+" "+super.toString();
    }
}

