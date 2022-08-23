package com.nseit.spring.simplescope;

import org.springframework.stereotype.Component;
@Component
//@Qualifier("quick")
public class QuickSort implements SortAlg {


    public int[] sort(int[] numbers) {
        return numbers;
    }
}
