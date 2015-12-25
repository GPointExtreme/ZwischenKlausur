
public class TicTacToeHelper {
	
	public static char[][] generateEmtyBoard(int size) {
		char[][] array = new char[size][size];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = ' ';
			}
		}
		return array;
	}
	
	public static boolean validateBoard(char[][] board, int size) {
		if (board.length == size) {
			return true;
		}
		return false;
	}
	
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char[][] myBoard = generateEmtyBoard(3);
		System.out.println(validateBoard(myBoard, 4));
		System.out.println(validateBoard(myBoard, 3));
		
		
		myBoard[0][0] = 'X';
		myBoard[0][1] = 'X';
		myBoard[0][2] = 'O';
		myBoard[1][0] = 'X';
		myBoard[1][2] = 'O';
		myBoard[2][0] = 'O';
		myBoard[2][2] = 'X';
		
		printBoard(myBoard);
		
	}

}
