import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = 9;
        char[][] board = new char[m][m];

        for (int i = 0; i < board.length; i++) {
            board[i] = reader.readLine().replaceAll("\\s+", "").toCharArray();
        }

        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {

        int n = 9;

        for (int i = 0; i < n; i+= 3) {
            for (int j = 0; j < n; j+= 3) {
                if (!checkSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return checkRows(board) && checkCols(board);
    }

    private static boolean checkSubBox(char[][] board, int startRow, int startCol) {

            List<Character> numbers = new ArrayList<>();
            for (int i = startRow; i < startRow + 3; i++) {
                for (int j = startCol; j < startCol + 3; j++) {
                    if (board[i][j] == '.') {
                        continue;
                    }
                    if (numbers.contains(board[i][j])) {
                        return false;
                    } else numbers.add(board[i][j]);
                }
            }
        return true;
    }

    private static boolean checkCols(char[][] board) {
        List<Character> numbers = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (numbers.contains(board[j][i])) {
                    return false;
                } else {
                    numbers.add(board[j][i]);
                }
            }
            numbers.clear();
        }
        return true;
    }

    private static boolean checkRows(char[][] board) {
        List<Character> numbers = new ArrayList<>();
        for (char[] rows : board) {
            for (char value : rows) {
                if (value == '.') {
                    continue;
                }
                if (numbers.contains(value)) {
                    return false;
                } else {
                    numbers.add(value);
                }
            }
            numbers.clear();
        }
        return true;
    }
}
