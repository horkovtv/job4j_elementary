package ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            min = min > array[index] ? array[index] : min;
        }
        return min;
    }
}
