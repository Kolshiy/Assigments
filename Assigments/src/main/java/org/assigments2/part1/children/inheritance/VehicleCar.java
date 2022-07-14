package org.assigments2.part1.children.inheritance;

import org.assigments2.part1.parents.inheritance.Vehicle;
import org.assigments2.part1.parents.interfaces.VehicleBehaviorOne;
import org.assigments2.part1.parents.interfaces.VehicleBehaviorTwo;

public class VehicleCar extends Vehicle implements VehicleBehaviorOne, VehicleBehaviorTwo {
    private int numberOfWheels;
    private int numberOfSeats;


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void sound() {
        System.out.println("Vrum Vrum");

    }

    @Override
    public void fuel() {
        System.out.println("The car runs on gasoline");

    }
}
