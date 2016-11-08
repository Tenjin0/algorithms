package fr.tenji.java;

/**
 * Created by root on 23/10/16.
 */
public class Calculator implements AdvancedArithmetic{

    public long power(int i, int j) throws Exception {
        if (i < 0 || j < 0) {
            throw new Exception("n and p should be non-negative");
        }
        long l = 1;
        for (int k = 0; k <j ; k++) {
            l = l * i;
        }
        return l;
    };

    @Override
    public int divisorSum(int n) {
        int mid = n / 2;
        int sum = 0;
        for (int i = 1; i <= mid; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        sum += n;
        return sum;
    }
}
