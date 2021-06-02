package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        for (int coordX = 0; coordX < width; coordX++) {
            for (int coordY = 0; coordY < height; coordY++) {
                if ((coordX + coordY) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(5, 7);
    }
}
