package org.example.company;

import java.util.Objects;

public class Car {
    private  boolean  engine;
    private int cylinders;
    private String name;
    private  int wheels;
    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine=true;
        this.wheels=4;


    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
    @Override
    public String toString() {
        return "Car {" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && cylinders == car.cylinders && wheels == car.wheels && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, cylinders, name, wheels);
    }

    public String startEngine() {
        String message = getClass().getSimpleName() + "'s engine is starting.";
        System.out.println(message);
        return message;
    }

    public String accelerate() {
        String message = getClass().getSimpleName() + " is accelerating.";
        System.out.println(message);
        return message;
    }

    public String brake() {
        String message = getClass().getSimpleName() + " is braking.";
        System.out.println(message);
        return message;
    }






}
