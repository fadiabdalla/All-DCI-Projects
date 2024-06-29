package game;

public class Main {

    public static void main(String[] args) {

        GameLogic logic = new GameLogic();
        UserInput input = new UserInput();
        Display display = new Display();
        boolean stillPlaying = true;

        while (stillPlaying) {

            System.out.println("Welcome to the Game ");
            display.display(logic.getBoard());

            int row = input.inputRows();
            int col = input.inputColumns();

            if (logic.makeMove(row, col)) {
                display.display(logic.getBoard());
            } else {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            if (logic.win()) {
                System.out.println(logic.getCurrentPlayer() + " has won!");
                break;
            } else if (logic.draw()) {
                System.out.println("It's a draw!");
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
