package mmorpg.model;

import java.util.ArrayList;

public class Warrior extends Person {
    private int pos = 0; //point of strength;

    public Warrior(String name, int level, int pol, Race race, Classes Class, int pos) {
        super(name, level,pol, race,Class);
        this.setPos(pos);
    }

    public int getPos(){
        return this.pos;
    }

    public void setPos(int pos){
        this.pos = pos;
    }

    ArrayList<String> warrior = new ArrayList<>();


}
