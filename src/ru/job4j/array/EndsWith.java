package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            result = post[post.length - 1] != word[word.length - 1] ? false : result;
        }
        return result;
    }
}
