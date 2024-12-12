package TruckAndCar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PassengerTest {

    @Test
    public void getWeight() {
        Passenger passenger = new Passenger(55);
        double weight = passenger.getWeight();
        Assertions.assertEquals(5555, weight);

    }

//
//    @Test
//    public void testCarLoadPassenger(){
//        Car car = new Car(2000);
//        Passenger passenger = new Passenger(50);
//        Passengers passengers = new Passengers();
//        passengers.addPassenger(passenger);
//
//        car.loadPassenger(passengers);
//        double load = car.getTotalLoad();
//        double correctValue = 15651;
//
//        Assert.assertEquals("car load function fail", correctValue, load);
//
//    }
//
//    @Test
//    public void testTruckLoadPassenger(){
//        Truck truck = new Truck(2000);
//        Passenger passenger = new Passenger(50);
//        Passengers passengers = new Passengers();
//        passengers.addPassenger(passenger);
//
//        truck.loadPassenger(passengers);
//        double load = truck.getTotalLoad();
//        double correctValue = 50;
//        System.out.println(load);
//        System.out.println(correctValue);
//
//        Assert.assertEquals("car load function fail", load, correctValue);

//    }

}