/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
TOPICS :: Methods, ArrayList, HashMap, HashSet
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;

public class Notes4 {

    static boolean myMethod(){
        System.out.println("my Method call");
        return true;
    }

    // Method Overloading
    static int addition(int x, int y) {
      return x + y;
    }

    static double addition(double x, double y) {
      return x + y;
    }

    public static void main(String[] args) {
        boolean b = myMethod(); // Output > "my Method call"
        System.out.println(b); // Output > true

        // Method/Function Overloading calls
        int r1 = addition(4, 5);
        double r2 = addition(4.35, 4.65);
        System.out.println("int: " + r1); // Output > int: 9
        System.out.println("double: " + r2); // Output > double: 9.0


        // ArrayList: The ArrayList class is a resizable array, which can be found in the java.util package.
        ArrayList<String> coins = new ArrayList<String>(); // Create an ArrayList object
        // add() method:
        coins.add("1"); coins.add("2"); coins.add("5"); coins.add("10");
        System.out.println(coins); // Ouput > [1, 2, 5, 10]
        // get() method:
        System.out.println(coins.get(0)); // Output > 1
        // set() method:
        coins.set(3, "20");
        // remove() methos:
        coins.remove(1);
        //other methods: clear() to remove all the elements, size() to get the size of arrayList.
        for(String i : coins){
            System.out.print(i + " ");  // Output > 1 5 20
        }
        System.out.println();
        /*
            Elements in an ArrayList/HashMap/HashSet are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc
        */
        ArrayList<Integer> moneySpent = new ArrayList<Integer>();
        moneySpent.add(13); moneySpent.add(03); moneySpent.add(33); moneySpent.add(43); moneySpent.add(23);

        //Another useful class in the java.util package is the Collections class, which include the sort() method for
        //sorting lists alphabetically or numerically.
        Collections.sort(moneySpent); //sorting operation
        System.out.println(moneySpent); // Output > [3, 13, 23, 33, 43]

        //sorting in descending order:
        Collections.sort(moneySpent, Collections.reverseOrder());
        System.out.println(moneySpent); // Output > [43, 33, 23, 13, 3]


        // HashMap: store items in "key/value" pairs
        HashMap<String, String> address = new HashMap<String, String>();
        address.put("Devansh", "Lucknow"); address.put("Himanshu", "Jaipur"); address.put("Ahmed", "Mumbai");
        address.put("Priyanshu", "Jamnagar"); address.put("Vaibhav", "Muradnagar");
        System.out.println(address);
        // Output > {Ahmed=Mumbai, Devansh=Lucknow, Himanshu=Jaipur, Vaibhav=Muradnagar, Priyanshu=Jamnagar}
        System.out.println(address.get("Devansh")); // Output > Lucknow
        // other methods: clear, remove, size
        for(String i : address.keySet()) System.out.print(i + " "); //loop through key
        // Output > Ahmed Devansh Himanshu Vaibhav Priyanshu
        System.out.println();
        for(String i : address.values()) System.out.print(i + " "); //loop through values
        // Output > Mumbai Lucknow Jaipur Muradnagar Jamnagar
        System.out.println();


        // HashSet: collection of items where every item is unique
        HashSet<String> id = new HashSet<String>();
        id.add("111701011"); id.add("111701013"); id.add("111701001"); id.add("111701022"); id.add("111701029");
        System.out.println(id.contains("111701027")); // Output > false
        // other methods: remove, clear, size
        for(String i : id) System.out.print(i + " ");
        // Output > 111701001 111701013 111701011 111701022 111701029
        System.out.println();
    }
}
