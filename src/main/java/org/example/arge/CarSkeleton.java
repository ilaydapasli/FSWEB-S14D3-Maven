package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public  CarSkeleton(String description,String name){
        this.name=name;
        this.description = description;
    }
    public CarSkeleton() {


    }
    public String startEngine(){

        return null;
    }
    public String drive(){
        runEngine();
        return getClass().getSimpleName() + " is driving.";
    }
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + "'s engine is running.");
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
