package org.assigments2.part1.main;

import org.assigments2.part1.children.inheritance.VehiclePlane;

public class PlaneRunner extends VehiclePlane {

    public static void main(String[] args) {
        PlaneRunner plane = new PlaneRunner();

        plane.setBrand("Boeing");
        plane.setModel("747");
        plane.setNumberOfEngines(4);
        plane.setTransportationType("public transportation");

        System.out.println("I will fly with " + plane.getBrand() + " " + plane.getModel()
                + " which has " + plane.getNumberOfEngines() +
                " engines and it is used for " + plane.getTransportationType());

        plane.fuel();
        plane.sound();
    }
}
