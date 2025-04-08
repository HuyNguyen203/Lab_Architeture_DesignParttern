package com.example.strategy;

import java.util.Arrays;

interface SortStrategy {
    int[] sort(int[] array);
}

class MergeSortStrategy implements SortStrategy {
    public int[] sort(int[] array) {
        // Implement MergeSort logic here
        return array;
    }
}

class QuickSortStrategy implements SortStrategy {
    public int[] sort(int[] array) {
        // Implement QuickSort logic here
        return array;
    }
}
public class ArraySort {
    private SortStrategy sortStrategy;
    private int[] array;

    public ArraySort(int[] array) {
        this.array = array;
    }

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] executeSort() {
        return sortStrategy.sort(array);
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 7, 3, 9};
        ArraySort arraySort = new ArraySort(array);

        arraySort.setSortStrategy(new MergeSortStrategy());
        arraySort.executeSort();
        System.out.println("MergeSortStrategy: ");
        Arrays.stream(arraySort.array).forEach(a -> System.out.println(a));

    }
}


