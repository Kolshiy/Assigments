package org.assigments2.part1.children.abstracts;

import org.assigments2.part1.parents.abstracts.Person;

public class Student extends Person {
    public void learn(){
        System.out.println("He learns new things from the professor");
    }
    public void takeExam(){
        System.out.println("He takes exams on due date");
    }

    @Override
    public void dressSomeWay() {
        System.out.println("The student wears a blue uniform");
    }
}
