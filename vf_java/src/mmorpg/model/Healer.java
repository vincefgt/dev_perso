package mmorpg.model;

public class Healer extends Person{
    private int pom = 0; //point of strength;

    public Healer(String name, int level, int pol, Race race, Classes Class, int pom) {
        super(name, level,pol, race,Class);
        this.setPom(pom);
    }

    public int getPom(){
        return this.pom;
    }

    public void setPom(int pom){
        this.pom = pom;
    }












}
