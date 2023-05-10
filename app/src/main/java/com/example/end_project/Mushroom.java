package com.example.end_project;

public class Mushroom {

    private String ID;
    private String name;
    private String type;
    private String location;
    private String category;

    public Mushroom(String ID, String name, String type, String location, String category) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.location = location;
        this.category = category;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mushroom{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
