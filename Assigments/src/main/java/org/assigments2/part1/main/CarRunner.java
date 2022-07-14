package org.assigments2.part1.main;

import org.assigments2.part1.children.inheritance.VehicleCar;

public class CarRunner extends VehicleCar {

    public static void main(String[] args) {

        CarRunner firstCar = new CarRunner();

        firstCar.setBrand("Reanult");
        firstCar.setModel("Clio");
        firstCar.setNumberOfSeats(4);
        firstCar.setNumberOfWheels(4);

        System.out.println("My car is " + firstCar.getBrand() + " " + firstCar.getModel()
                + " and it has " + firstCar.getNumberOfWheels() + " wheels"
                + " and " + firstCar.getNumberOfSeats() + " seats.");

        firstCar.fuel();
        firstCar.sound();


    }
}