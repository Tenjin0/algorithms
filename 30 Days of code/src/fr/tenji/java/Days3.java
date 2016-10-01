package fr.tenji.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by root on 01/10/16.
 */
public class Days3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int n = scan.nextInt();
        scan.close();
        String ans = "";

        if(n%2== 1 || n >= 6 && n <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
