package TruckAndCar;

import java.util.List;

public class Car extends Vehicle {


    @Override
    void setSeatCapacity(int seatCapacity) {
        if(seatCapacity > 5) {
            System.out.println("Seat capacity cannot be more than 5.");
            this.seatCapacity = 5;
        } else {
            this.seatCapacity = seatCapacity;
        }
    }

    public Car(double maxLoadCapacity) {
        this.setSeatCapacity(5);
        this.setMaxLoadCapacity(maxLoadCapacity);
    }







    @Override
    public boolean run() {
        // Check if the total load is within the capacity
        return !(this.getTotalLoad() > this.getMaxLoadCapacity());
    }
}
