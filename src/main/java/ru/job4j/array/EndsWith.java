package ru.job4j.array;

/**
 * 6.4.3. Слово заканчивается на ... [#156317]
 */
public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
