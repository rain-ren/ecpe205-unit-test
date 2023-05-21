/*
R.Talorong
GitHub Repo Link: https://github.com/rain-ren/ecpe205-unit-test.git
*/
package com.ecpe205;

public class Calculator {
    public double sum( double a, double b ) {
        return a + b;
    }

    public boolean isEven (int value) {
        return value % 2 == 0;
    }
    public boolean isOdd (int value) {
        return value % 2 == 1;
    }

    //R.Talorong
    public double power(int base, int power){
        int product = 1;
        for (int counter = 1;counter <= power; counter++){
            product *= base;
        }
        return product;
    }


    //R.Talorong
    public double factorial(int value) {
        double factorial = 1;
        for (double counter = value; counter > 0; counter--){
            factorial *= counter;
        }
        return factorial;
    }

    //R.Talorong
    public boolean isPalindrome(String word) {

        String palindrome = "";
        for (int counter = word.length()-1; counter >= 0; counter--){
            char individualChar = word.charAt(counter);
            palindrome += individualChar;
        }

        return word.equals(palindrome);
    }

    //R.Talorong
    public void insertionSort(int[] values) {
        for (int i = 1; i < values.length; i++){
            int insertionKey = values[i];
            int j = i - 1;

            for (; (j >=0 && values[j] > insertionKey); j--){
                values[j + 1] = values [j];
            }
            values [j + 1] = insertionKey;
        }

    }

    public void displayValues(int[] values) {
        for (int i : values ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public boolean isSortedInAscending(int[] values) {
        for ( int i = 0; i < values.length - 1 ; i++ ) {
            if ( values[i] > values[i + 1] ) {
                return false;
            }
        }

        return true;

    }
}
