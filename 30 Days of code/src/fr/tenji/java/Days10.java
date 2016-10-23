package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by root on 13/10/16.
 */
public class Days10 {

    public static String convertDecToBin (int n) {
        String bin = "";
        while (n/2 != 0) {
            bin += n%2;
            n = n/2;
        }
        bin += n%2;
        return bin;
    }
    public static void main(String[] args) {
        int n = 17;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();
        String bin = convertDecToBin(n);
        int max = 0;
        int count = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                count++;
            } else {
                count = 0;
            }
            if (max <= count) {
                max = count;
            }
        }
        System.out.println(convertDecToBin(n));
        System.out.println(max);
    }
}
