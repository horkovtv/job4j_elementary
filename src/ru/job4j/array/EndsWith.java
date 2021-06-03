package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        String wordCheck = new String(word);
        String postCheck = new String(post);
        return wordCheck.endsWith(postCheck);
    }
}
