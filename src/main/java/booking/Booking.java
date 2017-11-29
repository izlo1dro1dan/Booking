package main.java.booking;

public class Booking  extends DescriptionDecorator{

    int orderId;

    public Booking(DecoraterInt decoratedName) {
        super(decoratedName);
    }

    @Override
    public void out() {
        System.out.println("Booking run");
    }
    boolean booking(String ){

    }


}
