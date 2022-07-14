package org.assigments2.part2.children;

import org.assigments2.part2.parents.DbOperations;

public class MySQLDataBase implements DbOperations {
    @Override
    public void createObject() {
        System.out.println("Create an object inside a MySQL database.");
    }

    @Override
    public void readObject() {
        System.out.println("Read an object inside a MySQL database.");
    }

    @Override
    public void updateObject() {
        System.out.println("Update an object inside a MySQL database.");
    }

    @Override
    public void deleteObject() {
        System.out.println("Delete an object inside a MySQL database.");
    }
}
