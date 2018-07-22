package com.company;

public class Main {

    public static void main(String[] args) {

        int[] myArr1 = {1, 1, 1, 3, 4, 5, 5, 5, 5, 5, 3, 3, 4, 3, 3};
        int[] myArr2 = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5};

        System.out.println(findSequence(myArr1));
        System.out.println(findSequence(myArr2));

    }

    static int findSequence(int[] arr) {

        int frequency = 1;
        int bestNumber = arr[0];
        int bestFrequency = 0;

        for (int n = 1; n < arr.length; n++) {
            if (arr[n] != arr[n - 1]) {
                if (frequency > bestFrequency) {
                    bestNumber = arr[n - 1];
                    bestFrequency = frequency;
                }
                frequency = 1;
            } else {
                frequency++;
            }
        }

        return bestNumber;
    }
}