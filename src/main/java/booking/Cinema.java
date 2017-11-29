package main.java.booking;

public class Cinema {

    Cinema(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String name;
    String type;

    public String[][] getSeat() {
        return seat;
    }

    public void setSeat(String[][] seat) {
        this.seat = seat;
    }

    String [][] seat = new String[10][10];

}
