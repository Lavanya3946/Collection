package com.xworkz.listmethod.internal;

public class Sport {
    private String name;
    private String type;
    private int players;


    public Sport(String name, String type, int players) {
        this.name = name;
        this.type = type;
        this.players = players;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }


    @Override
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", players=" + players +
                '}';
    }
}

