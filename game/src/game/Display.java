package game;

 class Display {
	public void display(char board[][]) {
		for (int i = 0; i < 3; i++) {
			System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
		
		}
	}
}