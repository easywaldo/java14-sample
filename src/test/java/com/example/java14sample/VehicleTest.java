package com.example.java14sample;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VehicleTest {
    @Test
    public void usage_test() {
        Vehicle vehicle = new Truck("myTruck001", 2000);

        int loadCapacity = 0;
        int numberOfSeats = 0;

        if (vehicle instanceof Truck) {
            loadCapacity = ((Truck) vehicle).getLoadCapacity();
        }
        else if (vehicle instanceof Car) {
            numberOfSeats = ((Car) vehicle).getNumberOfSeats();
        }
        else {
            throw new RuntimeException("Unknown instance of Vehicle");
        }

        System.out.println(loadCapacity);
        System.out.println(numberOfSeats);

    }
}