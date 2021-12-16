package com.example.java14sample;

public final class Truck extends Vehicle implements Service {

    private final int loadCapacity;
    public Truck(String registrationNumber, int loadCapacity) {
        super(registrationNumber);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public int getMaxServiceIntervalInMonths() {
        return 100;
    }
}
