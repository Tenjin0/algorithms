package fr.tenji.java;

import java.util.Scanner;
import java.util.Arrays;
/**
 * Created by nekran on 11/10/16.
 */
public class Days7v2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        int mid = n / 2;
        int temp ;
        int length = arr.length - 1;
        for (int i = 0; i < mid; i++) {
            temp = arr[length - i];
            arr[length - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
