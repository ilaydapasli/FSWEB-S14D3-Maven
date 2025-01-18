package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
   private double averageKmPerLitre;
   private int cylinders;

    public GasPoweredCar(String name, String description, double averageKmPerLitre, int cylinders) {
        super(name,description);
        this.averageKmPerLitre = averageKmPerLitre;
        this.cylinders = cylinders;
    }
    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s gas engine is starting.";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " is driving with gas engine.";
    }

    public double  getAverageKmPerLiter(){
        return  averageKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
}
