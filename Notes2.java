// Exceptions are Java's way to report errors

import java.util.Arrays;

public class Notes2 {

    public static void main(String[] args) {

        //Array in Java are of fixed lengths.
        int[] sampleArray = new int[10]; //size : 10
        sampleArray[0] = 2;
        sampleArray[1] = 4;
        System.out.println(Arrays.toString(sampleArray)); //Output > [2, 4, 0, 0, 0, 0, 0, 0, 0, 0]
        /*
            Methods of Array: sort(), toString(), ...
        */

        int[] iniArray = {2, 3, 1, 5, 4};
        System.out.println(iniArray.length); //Output > 5

        //Multidimension Arrays
        int[][] multiArr = new int[2][3];
        int[][] iniMultiArr = {{1, 2, 3}, {4, 5, 6}};
        multiArr[0][0] = 1;
        System.out.println(Arrays.toString(multiArr)); //Output > [[I@4dc63996, [I@d716361]  :bcs one index is an array
        System.out.println(Arrays.deepToString(multiArr)); //Output > [[1, 0, 0], [0, 0, 0]]

        //Constants in Java are named in allCapital format.
        //to declare a constant(which cannot be changed in the program) we use 'final' keyword before declaration
        final float PI = 3.14F;

        //operations: same as in C/C++
        int s = 10 / 3; //s=3
        double s2 = (double)10 / (double)3 ; //s2=3.3333333333333335 //type casting

        short sh = 1;
        int y = sh + 2; //Implicit typecasting > byte -> short -> int -> long -> float -> double

        //note the Capital 'S' in 'String' keyword
        String intStr = "123";
        System.out.println(Integer.parseInt(intStr)); //Output > 123
    }
}
