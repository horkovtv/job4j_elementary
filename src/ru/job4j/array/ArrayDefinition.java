package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] age = new short[10];
        String[] surnames = new String[10500];
        float[] prices = new float[40];
        System.out.println("Размер массива age равен: " + age.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);

        String[] names = new String[4];
        names[0] = "Камила Голубева";
        names[1] = "Егор Семенов";
        names[2] = "Милана Нечаева";
        names[3] = "Александр Орлов";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
