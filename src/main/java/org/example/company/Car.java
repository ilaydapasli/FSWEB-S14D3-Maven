package org.example.company;

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
    }@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Eğer aynı referans ise eşittir
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Null ya da farklı sınıftan bir nesne eşit değildir
        }
        Car car = (Car) obj; // Nesneyi Car türüne dönüştür
        return cylinders == car.cylinders &&
                (name != null ? name.equals(car.name) : car.name == null); // name ve cylinders eşit mi kontrol et
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
