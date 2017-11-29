package main.java.booking;

public class Manager extends User implements Decoder {
    @Override
    public void out() {
        System.out.println("Manager use");
    }
}
