package fr.tenji.java;

import java.util.Scanner;

/**
 * Created by nekran on 11/10/16.
 */
public class Days7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        StringBuilder s = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            s.append(arr[i]);
            if (i != 0) {
                s.append(' ');
            }
        }
        System.out.println(s);
    }
}
