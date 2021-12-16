package com.example.java14sample;

public sealed interface Service permits Car, Truck  {
    int getMaxServiceIntervalInMonths();

    default int getMaxDistanceBetweenServicesInKilometers() {
        return 100000;
    }
}
