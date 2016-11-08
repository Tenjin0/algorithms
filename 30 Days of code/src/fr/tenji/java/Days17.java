package fr.tenji.java;

/**
 * Created by root on 23/10/16.
 */
public class Days17 {
    public static void main(String[] args) {
        int[][] powerEntries = {
                {3,5},
                {2,4},
                {-1, -2},
                {-1, 3}
        };
        for (int i = 0; i < powerEntries.length; i++) {
            Calculator c = new Calculator();
            try {
                System.out.println(c.power(powerEntries[i][0], powerEntries[i][1]));
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
