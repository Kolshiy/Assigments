package org.assigments2.part1.children.abstracts;

import org.assigments2.part1.parents.abstracts.Person;

public class Janitor extends Person {
    public void swep(){
        System.out.println("He sweps floors around the school");
    }

    public void clean(){
        System.out.println("He cleans school's bathrooms");
    }

    @Override
    public void dressSomeWay() {
        System.out.println("The janitor wears a blue or black coverall");
    }
}
