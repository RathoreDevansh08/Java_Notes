/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
TOPICS :: Iterator, Wrapper Classes, Exception Handling
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Iterator; //for iterator

public class Notes5 {

    public static void main(String[] args) {

        /*
            An Iterator is an object which can be used to loop through collections, like ArrayList and HashSet. It is
            called an "iterator" because "iterating" is the technical term for looping.
            The iterator() method can be used to get an Iterator for any collection.
        */
        ArrayList<String> coins = new ArrayList<String>();
        coins.add("1"); coins.add("2"); coins.add("5"); coins.add("10");

        //it starts from initial head(empty) position.
        Iterator<String> it = coins.iterator();
        System.out.println(it.next()); //Output > 1

        // it.next() : gives out next element and then jumps to it.
        while(it.hasNext()) {
            System.out.print(it.next() + " ");  //Output > 2 5 10
        }
        System.out.println();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12); numbers.add(8); numbers.add(2); numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext()) {
          Integer i = it2.next();
          if(i < 10) it2.remove();
        }
        System.out.println(numbers); // Output > [12, 23]


        /*
            Java Wrapper Classes: provide a way to use primitive data types (int, boolean, etc..) as objects.

            ---------------------------------------------------------------
            |    Primitive Data type  ----->  Wrapper Class               |
            ---------------------------------------------------------------
            |    byte                 |       Byte                        |
            |    short                |       Short                       |
            |    int                  |       Integer                     |
            |    long                 |       Long                        |
            |    float                |       Float                       |
            |    double               |       Double                      |
            |    boolean              |       Boolean                     |
            |    char                 |       Character                   |
            ---------------------------------------------------------------

            We use wrapper classes when working with Collection objects, such as ArrayList, where
            primitive types cannot be used (the list can only store objects).
            eg.
                ArrayList<int> myNumbers = new ArrayList<int>();  //INVALID
                ArrayList<Integer> myNumbers = new ArrayList<Integer>();  //VALID
        */
        Integer myInt = 5;
        System.out.println(myInt); // Output > 5
        /*
            The following methods are used to get the value associated with the corresponding wrapper object:
            intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(),
            booleanValue().
        */
        System.out.println(myInt.intValue()); //Output > 5  //Same as above
        System.out.println(myInt.toString().length()); //Output > 1  //convert into string, find length of the string


        /*
            Java exception handling ::

            The try statement allows you to define a block of code to be tested for errors while it is being executed.
            The catch statement allows you to define a block of code to be executed, if an error occurs in the try
            block.
            The finally statement lets you execute code, after try...catch, regardless of the result.
            The throw statement allows you to create a custom error. The throw statement is used together with an
            exception type. There are many exception types available in Java: ArithmeticException,
            FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc
        */
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        // Output > Something went wrong: java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        // Output > The 'try catch' is finished.
        }

        int age = 20;
        if(age > 18) throw new ArithmeticException("Under Age Limit!!"); // Output > Exception ... Under Age Limit!!
        else System.out.println("Permission granted!!");

    }
}
