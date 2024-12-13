package TruckAndCar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class PassengersTest {

    @Test
    public void testPassengers(){
        Passengers passengers = new Passengers();

        Passenger p1 = new Passenger(50);
        Passenger p2 = new Passenger(50);
        Passenger p3 = new Passenger(80);

        passengers.addPassenger(p1);
        passengers.addPassenger(p2);

        List<Passenger> testList = new ArrayList<>();
        testList.add(p1);
        testList.add(p3);

        Assertions.assertEquals(testList, passengers.getPassengers());

    }


}
