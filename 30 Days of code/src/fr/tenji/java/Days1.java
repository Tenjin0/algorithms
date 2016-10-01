package fr.tenji.java;

import java.util.*;

class Days1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        //4scan.nextLine();
        int i2;
        double d2;
        String s2;
        /* Read and save an integer, double, and String to your variables.*/
        i2 = Integer.parseInt(scan.nextLine());
        d2 = Double.parseDouble(scan.nextLine());
        s2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);
//        /* Concatenate and print the String variables on a new line;
//        	the 's' variable above should be printed first. */
        System.out.println(s  +  s2);
        scan.close();
        
    }
}
