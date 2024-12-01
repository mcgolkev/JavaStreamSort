package org.example;

import java.util.Comparator;

public class Vehicle implements Comparable<Vehicle> {

    public Vehicle(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
    }

    int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    String make;
    String model;

    @Override
    public int compareTo(Vehicle o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
