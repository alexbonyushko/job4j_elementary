package ru.job4j.array;

/**
 * 6.7.1. Моно строка в матрице. [#214126]
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * 6.7.2. Моно столбец в матрице. [#214127]
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * * 6.7.3. Массив из диагонали матрицы. [#214128]
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }

        return rsl;
    }

    /**
     * 6.7.4. Выигрышные комбинации в сокобан [#53859]
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (monoHorizontal(board, i) || monoVertical(board, i))) {
                result = true;
                break;

            }
        }
        return result;
    }
}
