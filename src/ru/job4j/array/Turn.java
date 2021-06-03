package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int lastIndex = array.length - 1;
        int temp;
        for (int i = 0; i < lastIndex / 2 + 1; i++) {
            temp = array[lastIndex - i];
            array[lastIndex - i] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
