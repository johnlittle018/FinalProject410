package TruckAndCar;

import java.util.List;

abstract public class Vehicle {
    private double maxLoadCapacity;
    protected int seatCapacity;
    protected double totalLoad;
    protected int maxSeatCapacity = 2;

    public Vehicle(double maxLoadCapacity, int maxSeatCapacity){

        this.setMaxLoadCapacity(maxLoadCapacity);
        this.setTotalLoad(0);
        this.maxSeatCapacity = maxSeatCapacity;
        this.setSeatCapacity(maxSeatCapacity);



    }


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
    protected void setTotalLoad(double totalLoad) {
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


    public void setSeatCapacity(int seatCapacity) {

        if(seatCapacity > this.maxSeatCapacity) {
            // Throw exception
            System.out.println("Seat capacity is maximum " + this.maxSeatCapacity);
            this.seatCapacity = this.maxSeatCapacity;
        } else {
            this.seatCapacity = seatCapacity;
        }
    }


    public boolean run() {
        // Check if the total load is within the capacity
        return !(this.getTotalLoad() > this.getMaxLoadCapacity());
    }


}
