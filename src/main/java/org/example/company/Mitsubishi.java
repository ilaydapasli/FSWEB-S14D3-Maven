package org.example.company;

import org.example.company.Car;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s engine is starting specifically.";
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


