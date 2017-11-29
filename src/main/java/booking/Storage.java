package main.java.booking;

import java.util.LinkedHashMap;

public class Storage {
    LinkedHashMap<String, String> users = new LinkedHashMap();
    LinkedHashMap<String,String> manager = new LinkedHashMap();
    LinkedHashMap<String,String> movie = new LinkedHashMap();
    LinkedHashMap<String,Integer> tickets = new LinkedHashMap();


    public void addUser(String login){
        this.users.put("Name","login");
    }
    public void addManager(String login){
        this.manager.put("Name","login");
    }
    public void addMovie(String name){
        this.movie.put("Name","name");
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
