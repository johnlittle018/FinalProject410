import TruckAndCar.Car;
import TruckAndCar.Passenger;
import TruckAndCar.Passengers;
import TruckAndCar.Truck;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;


@RunWith(JUnit4.class)
public class TruckAndCarTest {

    @Test
    public void testCarLoadPassenger(){
        Car car = new Car(2000);
        Passenger passenger = new Passenger(50);
        Passengers passengers = new Passengers();
        passengers.addPassenger(passenger);

        car.loadPassenger(passengers);
        double load = car.getTotalLoad();
        double correctValue = 15651;

        Assert.assertEquals("car load function fail", correctValue, load);

    }

    @Test
    public void testTruckLoadPassenger(){
        Truck truck = new Truck(2000);
        Passenger passenger = new Passenger(50);
        Passengers passengers = new Passengers();
        passengers.addPassenger(passenger);

        truck.loadPassenger(passengers);
        double load = truck.getTotalLoad();
        double correctValue = 50;
        System.out.println(load);
        System.out.println(correctValue);

        Assert.assertEquals("car load function fail", load, correctValue);

    }

}
