package mmorpg.model;

public class Race {
    private String type;

    public Race(String type) {
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getType();
    }
}


