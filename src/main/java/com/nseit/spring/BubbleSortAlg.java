package com.nseit.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class BubbleSortAlg implements SortAlg {

    public int[] sort(int[] numbers) {
        return numbers;
    }

}
