package org.example;

public class BinarySearch {
    public int startBinarySearch(int[] inputArray, int numberSearched) {
        int low = 0;
        int high = inputArray.length - 1;
        int itterationCount = 0;
        while (low <= high) {
            itterationCount += 1;
            int mid = (low + high) / 2;
            int guess = inputArray[mid];
            if (guess == numberSearched) {
                return itterationCount;
            }
            if (guess > numberSearched) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }
}

