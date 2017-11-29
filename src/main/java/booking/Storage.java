package main.java.booking;

import java.util.LinkedHashMap;

public class Storage {
    LinkedHashMap<String, User> users = new LinkedHashMap();
    LinkedHashMap<String,Manager> manager = new LinkedHashMap();
    LinkedHashMap<String,Movie> movie = new LinkedHashMap();
    LinkedHashMap<String,Integer> tickets = new LinkedHashMap();
    Cinema [] cinemas = new Cinema[10];

    public Cinema[] getCinemas() {
        return cinemas;
    }

    public void setCinemas(Cinema[] cinemas) {
        this.cinemas = cinemas;
    }

    public void addUser(User user){
        this.users.put("Name",user);
    }
    public void addManager(Manager manager){
        this.manager.put("Name",manager);
    }
    public void addMovie(Movie movie){
        this.movie.put("Name",movie);
    }
    public boolean checkUser(String login){
        return this.users.containsValue("login");
    }
    public boolean checkManager(String login){
        return this.manager.containsValue("login");
    }
    public boolean checkMovie(String name){
        return this.movie.containsValue("login");
    }
    public void addTicket(int id){
        this.tickets.put("ID",id);
    }
    public boolean checkTicket(int id){
        return this.tickets.containsValue(id);
    }
}
