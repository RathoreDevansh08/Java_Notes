/* Multiline comment */
// Singleline comments

//For naming methods: camelCaseConvention, for classes: PascalNamingConvention.

//package com.dsr; //package declaration > to import class Main from /com/dsr

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
        System.out.println("Java World\n");

        /*
            Declaring Variables
                byte age = 30;
                long viewsCount = 3_123_456L; //L for long
                float price = 10.99F; //F for float
                char letter = ‘A’;
                boolean isEligible = true;
        */
    }

    //function belonging to a class is called its 'method'.
    /*
        All these classes and methods should have 'access modifier'. Its a special keyword that determines how other
        methods and classes can access these classes and methods. eg. public, private. Here it's public.
    */
}
