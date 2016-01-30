package org.gpoint.zw;

public class TicTacToeHelper {

	public static void main(String[] args) {

		char[][] tictac = generateEmptyBoard(3);
		
		tictac[0][0] = 'X';
		tictac[0][1] = 'X';
		tictac[0][2] = 'O';
		
		tictac[1][0] = 'X';
		tictac[1][2] = 'O';
		
		tictac[2][0] = 'O';
		tictac[2][2] = 'X';
		
		printBoard(tictac);
		
	}
	
	public static char[][] generateEmptyBoard(int size) {
		char[][] board = new char[size][size];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = ' ';
			}
		}
		return board;
	}
	
	public static boolean validateBoard(char[][] board, int size) {
		if(board.length == size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void printBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println();
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + "\t");			
			}
		}
	}
}
