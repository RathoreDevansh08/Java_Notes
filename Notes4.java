/*
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
TOPICS :: Methods
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
*/

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


    }
}
