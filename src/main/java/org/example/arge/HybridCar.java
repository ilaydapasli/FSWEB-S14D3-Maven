package org.example.arge;

public class HybridCar extends CarSkeleton{
   private double   averageKmPerLiter;
  private   int batterySize;
  private int cylinders;

    public HybridCar(String name,String description,double avgKmPerLitre, int batterySize, int cylinders) {
      super(name,description);
        this.averageKmPerLiter = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "'s hybrid engine is starting.";
    }

    @Override
    public String drive() {
        runEngine();
        return getClass().getSimpleName() + " is driving with hybrid engine.";
    }

    public double  getAvgKmPerLiter() {
        return  averageKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
