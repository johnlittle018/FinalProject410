package TruckAndCar;

import java.util.ArrayList;
import java.util.List;

public class Passengers {

    private List<Passenger> passengers;

    public Passengers(){
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public List<Passenger> getPassengers(){
        return passengers;
    }
}
