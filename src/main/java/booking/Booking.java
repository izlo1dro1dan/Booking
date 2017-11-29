package main.java.booking;

public class Booking {

    int orderId;
    Cinema cinema;

    public Booking(Cinema cinema) {
        this.cinema=cinema;
    }

    boolean booking(Integer ryad, Integer place){
        if (cinema.getSeat(ryad,place)!="Busy"){
            cinema.setSeat(ryad,place);
            return true;
        }
        return false;
    }


}
