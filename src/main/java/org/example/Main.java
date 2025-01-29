package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the the greatest integer you would like in the array");
        int[] sortedArray = new int[scanner.nextInt()];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i + 1;
        }
        System.out.println("Please enter the the the number you would like the binary search to find");
        int numberToSearch = scanner.nextInt();
        BinarySearch binarySearch = new BinarySearch();
        int numberOfIterations = binarySearch.startBinarySearch(sortedArray, numberToSearch);
        System.out.println("the number searched for was " + numberToSearch + " it was found at index " + (numberToSearch - 1) + " and it took " + numberOfIterations + " iterations to find the number");
    }

}