package ru.job4j.array;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }

    public static String[] swap(String[] array, int source, int dest) {
        String temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }
}
