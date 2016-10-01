package fr.tenji.java;

import java.util.Locale;
import java.util.Scanner;

class Days2 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        double mealCost = 12.0; //scan.nextDouble(); // original meal price
        int tipPercent = 20; //scan.nextInt(); // tip percentage
        int taxPercent = 8; //scan.nextInt(); // tax percentage
//        scan.close();

        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;

        int totalCost = (int)Math.round(mealCost + tip + tax);
        System.out.printf("The total meal cost is %d dollars.", totalCost);
    }
}