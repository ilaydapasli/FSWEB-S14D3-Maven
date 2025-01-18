package org.example.company;


// Subclass: Holden
public class Holden extends Car {
    public Holden(int cylinders, String name) {
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
