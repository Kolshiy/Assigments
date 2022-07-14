package org.assigments2.part1.children.abstracts;

import org.assigments2.part1.parents.abstracts.Person;

public class SecurityGuard extends Person {
    public void guard(){
        System.out.println("He guards the entrance of the school");
    }
    public void checkID(){
        System.out.println("He checks the student's IDs when they arrive");
    }

    @Override
    public void dressSomeWay() {
        System.out.println("He wears a blue T-shirt, black pants and a badge");
    }
}
