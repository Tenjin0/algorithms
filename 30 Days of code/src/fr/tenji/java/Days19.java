package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by nekran on 08/11/16.
 */

public class Days19 {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        scan.close();
        int n = 6;
        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
