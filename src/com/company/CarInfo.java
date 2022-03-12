package com.company;

public class CarInfo {
     private String model;
     private int yearofcar;
     private int price;
     private String colour;

    public CarInfo(String model, int yearofcar, int price, String colour) {
        this.model = model;
        this.yearofcar = yearofcar;
        this.price = price;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearofcar() {
        return yearofcar;
    }

    public void setYearofcar(int yearofcar) {
        this.yearofcar = yearofcar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return " info -" +
                " model = " + model  +
                ", yearofcar = " + yearofcar +
                ", price = " + price +"$"+
                ", colour = " + colour;
    }
}
