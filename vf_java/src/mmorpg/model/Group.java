package mmorpg.model;

import java.util.ArrayList;

public class Group {
    private String groupName;
    private String p1;
    private String p2;
    private String p3;
    private

    static ArrayList<Person> groupPersons = new ArrayList<>();

    //static ArrayList<Group> groupGroup = new ArrayList<>();

    public Group(String groupName, String p1, String p2, String p3) {
        this.setGroupName(groupName);
        this.setGroupPersons(p1,p2,p3);
    }

    public String getGroupName() {
        return groupName;
    }

    public String getP1() {
        return p1;
    }
    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }
    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }
    public void setP3(String p3) {
        this.p3 = p3;
    }

    public static ArrayList<Person> getGroupPersons() {
        return groupPersons;
    }

    public static void setGroupPersons(String p1, String p2, String p3) {
        Group.getGroupPersons().add(p1);
        Group.getGroupPersons().add(p2);
        Group.getGroupPersons().add(p3);
    }

    public String setGroupName(String groupName) {
        return this.groupName;
    }

@Override
    public String toString() {
        return "Group: "+getGroupName()+" ":
}
}
