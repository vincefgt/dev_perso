package mmorpg.model;

import java.util.HashMap;
import java.util.Map;

public class Race {
    private String type;
    private static Map<String, Race> raceMap = new HashMap<>();


    public Race(String type) {
        this.setRace(type);
    }

    public static Map<String, Race> getRace() {
        return raceMap;
    }

    public void setRace(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getRace().toString();
    }
}


