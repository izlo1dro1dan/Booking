package main.java.booking;

public class Starter {
    public static void main(String [] args){
        System.out.println("Start");
        Storage storage = new Storage();
        storage.cinemas[0]= new Cinema("Arman");

        Booking booking = new Booking(storage.cinemas[0]);
        booking.booking(7,"A");
    }
}
