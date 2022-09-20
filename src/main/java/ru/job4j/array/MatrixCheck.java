package ru.job4j.array;

/**
 * 6.7.1. Моно строка в матрице. [#214126]
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == (' ')) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
