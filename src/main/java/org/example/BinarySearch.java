package org.example;

public class BinarySearch {
    public int startBinarySearch(int[] inputArray, int numberSearched) {
        int low = 0;//lower bound of the index that is being searched in
        int high = inputArray.length - 1;//upper bound of the index that is being searched in
        int iterationCount = 0;
        while (low <= high) {//while the search has not been narrowed down to a single element
            iterationCount += 1;//how many iterations it took to find the number searched for
            int mid = (low + high) / 2;//checks the middle element
            int guess = inputArray[mid];
            if (guess == numberSearched) { //if you found the item being searched for
                return iterationCount;
            }
            if (guess > numberSearched) {//if the guess was too high
                high = mid - 1;
            } else {//the guess was too low
                low = mid + 1;
            }
        }
        return -1;//this is saying the number being asked to search for does not exist
    }
}

