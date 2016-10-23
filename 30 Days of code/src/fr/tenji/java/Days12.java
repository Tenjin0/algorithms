package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by nekran on 20/10/16.
 */
public class Days12 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String firstName = scan.next();
//        String lastName =scan.next();
//        int id = scan.nextInt();
//        int numScores = scan.nextInt();
//        int[] testScores = new int[numScores];
//        for (int i = 0; i < testScores.length; i++) {
//            testScores[i] = scan.nextInt();
//        }
//        scan.close();

        Student s = new Student("Heraldo", "Memelli", 8135627, new int[]{100, 80});
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
