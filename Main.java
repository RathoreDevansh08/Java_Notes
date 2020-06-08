/* Multiline comment */
// Singleline comments

//For naming methods, identifiers: camelCaseConvention, for classes: PascalNamingConvention.

//package com.dsr; //package declaration > to import class Main from /com/dsr
// incase of using this package compile the code as: java com.dsr.Main (current directory: 'src' -> com -> dsr -> Main)

// Inorder to use a class from different package, we import it.
import java.util.Date; //for Date class
import java.awt.*; //for Point class

//Class: container to one or more functions
//Every Java program has at least one class
public class Main {

    //compulsory function in every program
    public static void main(String[] args) { //{ for a function is in the same line after ')' as a convention
        /*
            Enter point for programs.
            Initial function to execute.
            Doesn't exists on its own, always belongs to a class.
        */
        int age = 30, temp = 20;
        System.out.println("Java World\n"); //Output > Java World

        /*
            Declaring Variables
                byte age = 30;
                long viewsCount = 3_123_456L; //L for long
                float price = 10.99F; //F for float
                char letter = ‘A’;
                boolean isEligible = true;
        */
        int viewsCount = 123_456_789; // = 123456789 = 123,456,789

        // By default Java compiler takes integers as int, and decimal values as double
        long car = 3_123_456_789L;
        float bal = 10.49F;
        boolean isPar = true;

        //need to have 'new' to initialize variables of reference type.
        Date now = new Date(); //variable now has become an instance of this Date class (corresponding to Date())
        System.out.println(now); //Output > Mon Jun 08 18:39:57 IST 2020

        Point coord = new Point(1, 1);

        //For primitive type variables, only value gets copied
        int x1 = 2;
        int x2 = x1;
        x1 = 3;
        System.out.println(x2); //Output > 2

        //For reference type variables address is getting copied
        Point p1 = new Point(1, 1); //first coordinate is x, second one is the y coordinate
        Point p2 = p1;
        p1.x = 2;
        System.out.println(p2); //Output > java.awt.Point[x=2,y=1]

        //Strings are reference type in Java, but we can initialize it in a simler short hand
        String msg = "Hello World"; //equivalent to String msg = new String("Hello World");
    }

    //function belonging to a class is called its 'method'.
    /*
        All these classes and methods should have 'access modifier'. Its a special keyword that determines how other
        methods and classes can access these classes and methods. eg. public, private. Here it's public.
    */
}

/*
    Background Execution ::

        Source Code --> Java Compiler -->  Byte Code --> Java Virtual Machine (JVM) --> Native Code
        (*.java)                           (*.class)                                    (Windows, Mac, Linux)
*/
