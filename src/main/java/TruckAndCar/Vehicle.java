package TruckAndCar;

import java.util.List;

abstract public class Vehicle {
    private double maxLoadCapacity;

    abstract void setSeatCapacity(int seatCapacity);
    abstract void setTotalLoad(double totalLoad);
    abstract public void loadPassenger(List<Passenger> passengers);
    abstract public double getTotalLoad();
    abstract public boolean run();

    public double getMaxLoadCapacity() {
        return maxLoadCapacity;
    }
    public void setMaxLoadCapacity(double maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }
}
