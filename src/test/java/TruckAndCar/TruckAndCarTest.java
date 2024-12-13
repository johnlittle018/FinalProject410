package TruckAndCar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class VehicleTest {

    @Test
    public void getWeight() {
        Passenger passenger = new Passenger(55);
        double weight = passenger.getWeight();
        Assertions.assertEquals(55, weight);

    }

    @Test
    public void testCarLoadPassenger(){
        Car car = new Car(2000);
        Passenger passenger = new Passenger(50);
        Passengers passengers = new Passengers();
        passengers.addPassenger(passenger);

        car.loadPassenger(passengers);
        double load = car.getTotalLoad();
        double correctValue = 50;

        Assertions.assertEquals(correctValue, load);
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

        Assertions.assertEquals(correctValue, load);
    }

    @Test
    public void testVehicleGettersAndSetters(){
        Truck truck = new Truck(2000);
        Car car = new Car(700);

        Assertions.assertEquals(2000, truck.getMaxLoadCapacity());
        Assertions.assertEquals(700, car.getMaxLoadCapacity());

        truck.setMaxLoadCapacity(3000);
        car.setMaxLoadCapacity(1400);
        Assertions.assertEquals(3000, truck.getMaxLoadCapacity());
        Assertions.assertEquals(1500, car.getMaxLoadCapacity());




//        Assertions.assertEquals();
//        Assertions.assertEquals();
//        Assertions.assertEquals();
//        Assertions.assertEquals();
    }

    @Test
    public void testSetSeatCapacity(){
        Truck truck = new Truck(2000);
        Car car = new Car(700);


        // testing setting seat within rang
        truck.setSeatCapacity(1);
        car.setSeatCapacity(3);
        Assertions.assertEquals(1, truck.getSeatCapacity());
        Assertions.assertEquals(3, car.getSeatCapacity());



        // testing setting seat outside of range
        truck.setSeatCapacity(10);
        car.setSeatCapacity(10);
        Assertions.assertEquals(2, truck.getSeatCapacity());
        Assertions.assertEquals(5, car.getSeatCapacity());

    }

    @Test
    public void testRun(){


        // testing success

        Truck truck = new Truck(2000);
        Car car = new Car(700);
        Passenger passenger1 = new Passenger(50);
        Passenger passenger2 = new Passenger(50);
        Passengers passengers = new Passengers();
        passengers.addPassenger(passenger1);
        passengers.addPassenger(passenger2);

        truck.loadPassenger(passengers);
        car.loadPassenger(passengers);

        Assertions.assertTrue(truck.run());
        Assertions.assertTrue(car.run());

        // failing cause of too much passenger weight

        truck = new Truck(2000);
        car = new Car(700);
        passenger1 = new Passenger(2000);
        passenger2 = new Passenger(2000);
        passengers = new Passengers();
        passengers.addPassenger(passenger1);
        passengers.addPassenger(passenger2);

        truck.loadPassenger(passengers);
        car.loadPassenger(passengers);

        Assertions.assertFalse(truck.run());
        Assertions.assertFalse(car.run());

        // Truck failing cause of too much load weight

        truck = new Truck(2000);
        passenger1 = new Passenger(50);
        passenger2 = new Passenger(50);
        passengers = new Passengers();
        passengers.addPassenger(passenger1);
        passengers.addPassenger(passenger2);

        truck.loadPassenger(passengers);
        Weight weight = new Weight(1000);
        Tree tree = new Tree(1000);
        truck.loadWeight(weight);
        truck.loadWeight(tree);

        Assertions.assertFalse(truck.run());






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