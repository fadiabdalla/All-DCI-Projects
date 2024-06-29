package group_project_tic_tac_toe_game_exercise;

import java.util.Scanner;

public class UserInputAndDisplay {
    private Scanner scanner;

    public UserInputAndDisplay() {
        scanner = new Scanner(System.in);
    }

    public void displayBoard(char[][] board) {
        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public int[] getPlayerMove() {
        System.out.print("Enter your move (row and column): ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }

    public String askForReplay() {
        System.out.print("Do you want to play again? (yes/no): ");
        return scanner.next().toLowerCase();
    }
}