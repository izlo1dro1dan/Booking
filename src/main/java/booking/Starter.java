package main.java.booking;

public class Starter {
    public static void main(String [] args){
        System.out.println("Start");
        Storage storage = new Storage();
        storage.addCinema(new Cinema("Arman"));

        Booking booking = new Booking(storage.cinemas.get("Name"));
        booking.booking(7,8);


    }
}
