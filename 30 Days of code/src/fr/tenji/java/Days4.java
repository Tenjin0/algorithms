package fr.tenji.java;

import java.util.Scanner;
/**
 * Created by nekran on 05/10/16.
 */
public class Days4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        System.out.println("Chosen :" + t);
        Person[] persons = new Person[t];
        for (int i = 0; i < t; i++) {
            int age = scan.nextInt();
            persons[i] = new Person(age);
            persons[i].amIOld();
            for (int j = 0; j < 3; j++) {
                persons[i].yearPasses();
            }
            persons[i].amIOld();
        }
        scan.close();

    }
}
