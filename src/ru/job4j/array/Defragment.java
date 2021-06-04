package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int j = index; j < array.length; j++) {
                    if (array[j] != null) {
                        SwitchArray.swap(array, index, j);
                        break;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }
}
