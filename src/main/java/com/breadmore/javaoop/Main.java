package com.breadmore.javaoop;

import com.breadmore.javaoop.logic.BubbleSort;
import com.breadmore.javaoop.logic.JavaSort;
import com.breadmore.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
