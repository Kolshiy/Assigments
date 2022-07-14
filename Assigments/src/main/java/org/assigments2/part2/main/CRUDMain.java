package org.assigments2.part2.main;

import org.assigments2.part2.parents.MongoDbOperations;
import org.assigments2.part2.parents.DbOperations;
import org.assigments2.part2.children.MySQLDataBase;
import org.assigments2.part2.children.mongoDBDataBase;

import java.util.Scanner;

public class CRUDMain {
    public static void main(String[] args) {

        String dataBase = "MySQL";
        DbOperations operations;
        MongoDbOperations otherOperations;
        Scanner type = new Scanner(System.in);

        System.out.println("Type in the data base you want to work with (MySQL or mongoDB): ");


        if (dataBase.equals(type.nextLine())) {
            operations = new MySQLDataBase();
            operations.createObject();
            operations.readObject();
        } else {
            otherOperations = new mongoDBDataBase();
            otherOperations.CreateDb();
            otherOperations.createObject();
        }
    }

}
