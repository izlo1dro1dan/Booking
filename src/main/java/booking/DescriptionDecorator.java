package main.java.booking;

public abstract class DescriptionDecorator implements DecoraterInt {
    protected DecoraterInt decoratedShape;

    public DescriptionDecorator(DecoraterInt decoratedName){
        this.decoratedShape = decoratedName;
    }

    public void out(){
        decoratedShape.out();
    }
}