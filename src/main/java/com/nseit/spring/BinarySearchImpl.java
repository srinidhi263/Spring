package com.nseit.spring;

public class BinarySearchImpl {
    public int binarySearch(int[] numbers, int numberToSearch){
        BubbleSortAlg bubbleSort = new BubbleSortAlg();
        QuickSort quickSort = new QuickSort();
        int[] sortedNumbers = quickSort.sort(numbers);
        return 12;
    }
}
