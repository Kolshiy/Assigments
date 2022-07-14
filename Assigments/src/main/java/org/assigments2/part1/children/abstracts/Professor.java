package org.assigments2.part1.children.abstracts;

import org.assigments2.part1.parents.abstracts.Person;

public class Professor extends Person {
    public void teach(){
        System.out.println("He teaches students new things");
    }
    public void checkHomework(){
        System.out.println("He checks student's homework");
    }

    @Override
    public void dressSomeWay() {
        System.out.println("He wears a suit");
    }
}
