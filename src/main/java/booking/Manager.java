package main.java.booking;

public class Manager extends User{
    @Override
    public void out() {
        System.out.println("Manager use");
    }
    Storage storage;
    Manager(Storage storage){
        this.storage=storage;
    }
    public void addMovie(Movie movie){
        storage.addMovie(movie);
    }
    public void addCinema(Cinema cinema) {
        storage.addCinema(cinema);
    }
}
