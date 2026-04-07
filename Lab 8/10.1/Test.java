/* 10.1. Design and implement a Java program for a Vehicle Rental System using the concept of
abstract classes. Create an abstract class named Vehicle that contains basic details such as vehicle
number and model name. The class should include an abstract method calculateRent(int
days) to compute the rental cost based on the number of days, and a concrete
method displayDetails() to display vehicle information. Derive two classes from
the Vehicle class: Car, which calculates rent based on a fixed daily rate, and Bike, which
calculates rent based on a lower daily rate compared to cars. In the main method, create objects of
both Car and Bike, call their respective methods, and display the rental cost along with vehicle
details. */

abstract class Vehicle {
    String VehicleNumber;
    String modelName;

    Vehicle(String vehicleNumber, String modelName) {
        this.VehicleNumber = vehicleNumber;
        this.modelName = modelName;
    }

    abstract double calculateRent(int days);

    void displayDetails() {
        System.out.println("Vehicle Number: " + VehicleNumber);
        System.out.println("Model Name: " + modelName);
    }
}

class Car extends Vehicle {
    double ratePerDay = 2000;

    Car(String VehicleNumber, String modelName) {
        super(VehicleNumber, modelName);
    }

    double calculateRent(int days) {
        return days * ratePerDay;
    }
}

class Bike extends Vehicle {
    double ratePerDay = 800;

    Bike(String vehicleNumber, String modelName) {
        super(vehicleNumber, modelName);
    }

    double calculateRent(int days) {
        return days * ratePerDay;
    }
}

public class Test {
    public static void main(String[] args) {
        Car car = new Car("UK07AB1234", "Honda City");
        Bike bike = new Bike("UK07XY5678", "BMW");

        System.out.println("name: alisha, sap: 590013908, batch 1");
        car.displayDetails();
        System.out.println("Car Rent for 3 days: " + car.calculateRent(3));

        System.out.println();

        bike.displayDetails();
        System.out.println("Bike Rent for 3 days: " + bike.calculateRent(3));
    }
}