package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surnames = new String[10500];
        float[] prices = new float[40];
        System.out.println("Размер массива age равен: " + age.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
    }
}
