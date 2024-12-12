package TruckAndCar;

import java.util.List;

public class Truck extends Vehicle {



    public Truck(double maxLoadCapacity) {
        super(maxLoadCapacity ,2);
    }

    public void loadWeight(Weight weight) {
        this.setTotalLoad(this.getTotalLoad() + weight.getWeight());
    }


}
