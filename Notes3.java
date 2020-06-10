/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
TOPICS :: Conditional statements, Switch, Loops(For, While, Do-While, For-each), break/continue.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

public class Notes3 {

    public static void main(String[] args) {

        // comparision operators: ==, !=. >=, <=, >, <
        // logical operators: &&, ||, !

        // conditional statements
        int age = 21;
        if(age<18) System.out.println("Minor");
        else if (age>=18 && age<50) {
            System.out.println("Mid age: " + ++age);  // Output > Mid age: 22
        }
        else System.out.println("Old");

        String ternary = (10 >= 20) ? "Maths!!" : "Stupid!!"; //ternary operator
        System.out.println(ternary); // Output > "Stupid!!"

        // switch statements
        String sw1 = "mentor";
        switch(sw1){
            case "admin":
                System.out.println("Its Admin.");
                break;
            case "student":
                System.out.println("Its Student.");
                break;
            case "mentor":
                System.out.println("Its Mentor.");  // Output > "Its Mentor."
                break;
            default:
                System.out.println("Guest");
        }

        // We cannot use '!=' or '==' to compare two strings as they are of reference type.
        String nm = "DSR";
        System.out.println(nm.equals("DSR")); // Output > true

        // For loop
        for(int i=0; i<1; i++){
            System.out.println("Crazy"); // Output > "Crazy"
        }

        // While loop
        while(true)
        {
            break;
        }

        // Do While loop
        do {
            age++;
        } while(!true);

        // For-each loop
        String[] fruits = {"Apple", "Mango", "Orange"};
        for(String fruit : fruits){
            System.out.print(fruit);  // Ouput > AppleMangoOrange
        }
        System.out.println();

        /*
            break -> to end a loop, switch condition
            continue -> to bring at the loop beginning
        */

    }
}
