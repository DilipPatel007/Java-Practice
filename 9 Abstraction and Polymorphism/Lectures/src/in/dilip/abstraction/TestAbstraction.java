package in.dilip.abstraction;

public class TestAbstraction {

    public static void main(String[] args) {
        //Vehicle veh = new Vehicle(2);   // abstract class
        Car car = new Car();
        car.commute();
        car.makeStartSound();;


    }
}
