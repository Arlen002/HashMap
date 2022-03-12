package com.company;

public class Car {
    private String id ;
    private int nom;

    public Car(String id, int nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Car - " +
                " id = " + id + ", "+
                "nom = " + nom +",";
    }
}


