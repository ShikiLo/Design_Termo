package com.app;

public class ModelLayer {

    private int ID;
    private String name;
    private double R;
    private double sick;



    public void setCounter(int counter) {
        this.counter = counter;
    }

    private int counter;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getR() {
        return R;
    }

    public int getCounter() {
        return counter;
    }

    public double getSick() {
        return sick;
    }

    public void setSick(double sick) {
        this.sick = sick;
    }
}
