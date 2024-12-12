package TruckAndCar;

import java.util.List;

public class Truck extends Vehicle {




    @Override
    void setSeatCapacity(int seatCapacity) {
        if(seatCapacity > 2) {
            // Throw exception
            System.out.println("Seat capacity is maximum 2");
            this.seatCapacity = 2;
        } else {
            this.seatCapacity = seatCapacity;
        }
    }

    public Truck(double maxLoadCapacity) {
        this.setSeatCapacity(2);
        this.setMaxLoadCapacity(maxLoadCapacity);
        this.setTotalLoad(0);
    }

    void loadWeight(Weight weight) {
        this.setTotalLoad(this.getTotalLoad() + weight.getWeight());
    }




    @Override
    public boolean run() {
        // Check if the total load is within the capacity
        return !(this.getTotalLoad() > this.getMaxLoadCapacity());
    }
}
