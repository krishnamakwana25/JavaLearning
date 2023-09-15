package org.example.logicalprograms;

/**
 * given n numbers, find the greatest common denominator between them
 * a = [42,56,14]
 *
 */
public class GreatestCommonDenominator {
    public static void main(String[] args) {
        int[] a = {42,56,14};
        int result = a[0];
        for (int i = 0; i < a.length; i++) {
            result = findGcd(result,a[i]);
        }
        System.out.println(result);
    }

    private static int findGcd(int a, int b) {

        if(b==0){
            return a;
        }
        else {
            return findGcd(b,a%b);
        }
    }
}
