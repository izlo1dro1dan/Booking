package main.java.booking;

import java.util.LinkedHashMap;
import java.util.Map;

public class Storage {
    LinkedHashMap users = new LinkedHashMap();
    LinkedHashMap manager = new LinkedHashMap();
    LinkedHashMap movie = new LinkedHashMap();


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
}
