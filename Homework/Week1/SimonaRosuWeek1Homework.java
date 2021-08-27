package Homework.Week1;

import java.util.Arrays;

public class SimonaRosuWeek1Homework {
    public static void main(String[] args) {
        // Define and print on separate lines boolean, char, int, long, double, string and array data types:
        boolean a = true;
        boolean b = false;
        char letter = 115;
        int c = 32;
        long range = 2656354534L;
        double number = 4.17;
        String name = "Doesn't matter";
        int[] anything = {12, 4, 5, 2, 5};

        System.out.println("The boolean value of a is:" +a);
        System.out.println("The boolean value of b is: " +b);
        System.out.println("The char value of letter is: " +letter);
        System.out.println("The int value of c is: " +c);
        System.out.println("The long value of range is: " +range);
        System.out.println("The double value of number is: " +number);
        System.out.println("The string value of name is: " +name);
        System.out.println(Arrays.toString(anything));

        //Define some integer variables. Perform the increment, arithmetic and compare operations
        int x = 3, y = 4;
        int result1, result2;
        result1 = ++x;
        result2 = ++y;

        System.out.println("After increment, x=" + result1);
        System.out.println("After increment, y=" + result2);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("x is " + x + " and y is " + y);
        System.out.println("x>y este " + (x > y));
        System.out.println("x<y este " + (x > y));

        //Define e and f as integer variables. Compare these values using an if-else statement

        int e = 32, f = 45;
        if(e > f) {
            System.out.println("e is greater than f");
        } else{
            System.out.println("e is less than f");
        }

        //Define a number array of 10 elements. Use a for loop and skip the "15" value
        System.out.println("Rezultatul pt array fara valoarea 15 este: ");
        int[] arr = {100, 90, 80, 60, 40, 30, 20, 15, 10, 5};
        for(int k : arr) {
            if (k==15){
                continue;
        }
        System.out.println(k);
        }
}}



