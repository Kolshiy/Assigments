package org.assigments2.part1.children.inheritance;

import org.assigments2.part1.parents.inheritance.Vehicle;
import org.assigments2.part1.parents.interfaces.VehicleBehaviorOne;
import org.assigments2.part1.parents.interfaces.VehicleBehaviorTwo;

public class VehiclePlane extends Vehicle implements VehicleBehaviorOne, VehicleBehaviorTwo {
    private int numberOfEngines;
    private String transportationType;

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    @Override
    public void sound() {
        System.out.println("Flew Flew");
    }

    @Override
    public void fuel() {
        System.out.println("The plane runs on kerosen");
    }
}
