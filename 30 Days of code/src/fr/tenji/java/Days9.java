package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by nekran on 12/10/16.
 */
public class Days9 {
    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(Days9.factorial(n));
    }
}
