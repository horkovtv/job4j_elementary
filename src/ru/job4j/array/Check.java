package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean firstRec = false;
        for (int i = 0; i < data.length; i++) {
            firstRec = i == 0 ? data[i] : firstRec;
            result = firstRec != data[i] ? false : result;
        }
        return result;
    }
}
