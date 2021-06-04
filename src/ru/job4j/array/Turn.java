package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
