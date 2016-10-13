package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by nekran on 10/10/16.
 */
public class Days6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] nouns = new String[t];
        scan.nextLine();
        for (int i = 0; i < nouns.length; i++) {
            nouns[i] = scan.nextLine();
        }
        for (int i = 0; i < nouns.length; i++) {
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            for (int j = 0; j < nouns[i].length(); j++) {
                if (j%2 == 0) {
                    even.append(nouns[i].charAt(j));
                } else {
                    odd.append(nouns[i].charAt(j));
                }
            }
            System.out.println(even.toString() + " " + odd.toString());
        }
    }
}
