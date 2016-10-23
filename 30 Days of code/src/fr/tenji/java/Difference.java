package fr.tenji.java;

/**
 * Created by nekran on 20/10/16.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = 0;

    }

    public void computeDifference() {
        for (int i = 0; i < elements.length -1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int diff = Math.abs(elements[i] - elements[j]);
                if (diff > this.maximumDifference) {
                    this.maximumDifference = diff;
                }
            }
        }
    }
}
