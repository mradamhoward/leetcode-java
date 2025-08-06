package org.example;

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {

        HashSet<Integer> currentValues = new HashSet<>();
        boolean isValid = true;
        for(int j = 0; j < board.length; j++)
            for(int i = 0; i < board.length; i++) {
                int sizeBeforeAdd = currentValues.size();
                currentValues.add((int) board[j][i]);
                if (sizeBeforeAdd == currentValues.size()) {
                    isValid = false;
                }
            currentValues.clear();
        }



        return isValid;
    }
}
