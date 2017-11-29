package main.java.booking;

public class Manager extends User{

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
