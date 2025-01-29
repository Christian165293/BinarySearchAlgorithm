package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearch() {
        BinarySearch binarySearch = new BinarySearch();

        // Test case 1: target is in the middle
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target1 = 5;
        int result1 = binarySearch.startBinarySearch(arr1, target1);
        assertEquals(1, result1, "The number of iterations should be 1");

        // Test case 2: target is at the beginning
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 1;
        int result2 = binarySearch.startBinarySearch(arr2, target2);
        assertEquals(3, result2, "The number of iterations should be 3");

        // Test case 3: target is at the end
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target3 = 10;
        int result3 = binarySearch.startBinarySearch(arr3, target3);
        assertEquals(4, result3, "The number of iterations should be 4");

        // Test case 4: target is not in the array
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target4 = 11;
        int result4 = binarySearch.startBinarySearch(arr4, target4);
        assertEquals(-1, result4, """
                The number of iterations should be -1 since it the searched number does
                not exist within the bounds""");

    }
}