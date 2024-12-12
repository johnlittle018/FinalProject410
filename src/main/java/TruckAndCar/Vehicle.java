package TruckAndCar;

import java.util.List;

abstract public class Vehicle {
    private double maxLoadCapacity;
    protected int seatCapacity;
    protected double totalLoad;

    abstract void setSeatCapacity(int seatCapacity);
    abstract public boolean run();



    public double getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
    public void setMaxLoadCapacity(double maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }
    public int getSeatCapacity() {
        return seatCapacity;
    }
    public double getTotalLoad() {
        return this.totalLoad;
    }
    private void setTotalLoad(double totalLoad) {
        this.totalLoad = totalLoad;
    }


    public void loadPassenger(List<Passenger> passengers){
        double w = 0;
        for(Passenger p : passengers) {
            try {
                w += p.getWeight();
            } catch (Exception e) {
                System.out.println("One or more passenger object is null.!!");
            }
        }
        this.totalLoad = this.totalLoad + w;
    }


}
