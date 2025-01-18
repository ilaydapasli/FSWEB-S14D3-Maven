package org.example.company;

import org.example.company.Car;

// Subclass: Ford
public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "the car's engine is starting";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating specifically.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking specifically.";
    }
}

