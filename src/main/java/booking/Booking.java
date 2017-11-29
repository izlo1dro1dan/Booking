package main.java.booking;

public class Booking {

    int orderId;
    Cinema cinema;

    public Booking(Cinema cinema) {
        this.cinema=cinema;
    }

    boolean booking(Integer ryad, String place){
        cinema.setSeat(10);

    }


}
