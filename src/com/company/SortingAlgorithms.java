package com.company;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {

        int[] numbers = {7, 3, 2, 16, 24, 4, 11, 9};

        // Bubble sort -> sorts numbers by comparing numbers adjacent to it
        // time complexity of the bubble sort is 0(n^2)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                //Create a temp variable to hold the current value at index j
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];

                    //swap the numbers with each other
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

        // Insertion sort -> sorts numbers by comparing the values at the indexes with the previous elements
        // to sort elements. We place the value at the index where there are no lesser values than that element
        // time complexity of the insertion sort is 0(n^2)
        for (int i = 1; i < numbers.length; i++) {
            int valueToSort = numbers[i];
            int j;
            // the loop below is to store the number at the point where there are no less numbers than that value
            for (j = i; j > 0 && numbers[j - 1] > valueToSort; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = valueToSort;
        }
        System.out.println((Arrays.toString(numbers)));

        // Selection sort -> find the minimum element, swap that minimum element with the current element,
        // repeat the whole process until the array is fully sorted
        // time complexity of the selection sort is 0(n^2)
        for (int i = 0; i < numbers.length; i++) {
            int index = i; // current index of number
            for (int j = i + 1; j < numbers.length; j++)
                if (numbers[j] < numbers[index])
                    index = j; // swap if number at position j less than the number at position index
            int smallNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallNumber;
        }
        System.out.println((Arrays.toString(numbers)));

        mergeSort(0, numbers.length - 1, numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void mergeSort(int start, int end, int[] numbers){
        // Merge Sort
        // Divide the array into sub-arrays of about half size in each iteration/repetition until each sub array
        // has only one element. Merge each sub-array repeatedly to create sorted arrays. This is going to repeat itself
        // until we have only one sorted array. this is sorted array

        // Recursive method
        int mid = (start + end) / 2;
        if (start < end) {
            // Sort left half
            mergeSort(start, mid, numbers);
            // Sort right half
            mergeSort(mid + 1, end, numbers);
            // Merge left and right half
            merge(start, mid, end, numbers);
        }
    }
    public static void merge ( int start, int mid, int end, int[] numbers) {
        // Initializing temp array and index
        int[] tempArray = new int[numbers.length];
        int tmpArrayIndex = start;

        int startIndex = start;
        int midIndex = mid + 1;

        // Iterate until smaller list reaches to the end
        while (startIndex <= mid && midIndex <= end) {
            if (numbers[startIndex] < numbers[midIndex]) {
                tempArray[tmpArrayIndex++] = numbers[startIndex++];
            } else {
                tempArray[tmpArrayIndex++] = numbers[midIndex++];
            }
        }
        // Copy remaining elements
        while (startIndex <= mid) {
            tempArray[tmpArrayIndex++] = numbers[startIndex++];
        }

        while (midIndex <= end) {
            tempArray[tmpArrayIndex++] = numbers[midIndex++];
        }
        // Copy tmpArray to actual array after sorting
        if (end + 1 - start >= 0) {
            System.arraycopy(tempArray, start, numbers, start, end + 1 - start);
        }

    }
}


