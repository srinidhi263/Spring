package com.nseit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BinarySearchImpl {


@Autowired
//@Qualifier("quick")
private SortAlg quickSort;
//constructor injection
   // public BinarySearchImpl(SortAlg sortAlg) {
     //   this.sortAlg = sortAlg;
   // }
//setter injection
   // public void setSortAlg(SortAlg sortAlg) {
    //    this.quickSort = sortAlg;
   // }

    public int binarySearch(int[] numbers, int numberToSearch) {
       // BubbleSortAlg bubbleSort = new BubbleSortAlg();
       // QuickSort quickSort = new QuickSort();
        int[] sortedNumbers = quickSort.sort(numbers);
        System.out.println(quickSort);
        return 12;
    }
}
