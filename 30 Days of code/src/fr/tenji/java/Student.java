package fr.tenji.java;

/**
 * Created by nekran on 20/10/16.
 */
public class Student extends Person {
    int[] testScores;
    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }
    public Student(String firstName, String lastName, int id, int[] testScores) {
        this(firstName, lastName, id);
        this.testScores = testScores;
    }
    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    private int averageScore() {
        int sumScores = 0;
        for (int i = 0; i < this.testScores.length; i++) {
            sumScores += this.testScores[i];
        }
        return sumScores / testScores.length;
    }
    public char calculate() {
        int scoreToConvert = averageScore();
        if (scoreToConvert < 40) {
            return 'T';
        } else if (scoreToConvert < 55) {
            return 'D';
        } else if (scoreToConvert < 70) {
            return 'P';

        } else if (scoreToConvert <80) {
            return 'A';
        } else if (scoreToConvert <90) {
            return 'E';
        }
        return 'O';
    }

}
