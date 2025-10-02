import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener {
	public static void iterateThroughBoard(char[][] board) { // Prints out the baord for testing
		for (int i = 0; i < board.length; i++) { // Note that it is not formatted!!
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();

		}
	}

	public static void printOutBoardFormatted(char[][] board) {
		System.out.println("Eventually the board will be printed out in a formatted way!");
	}

	public static void main(String[] args) {
		char[][] board;
		board = new char[9][9]; // Setting board to hvae size of 9 by 9

		for (int i = 0; i < 9; i++) { // Filling the board up with some defaut values
			for (int j = 0; j < 9; j++) {
				board[i][j] = '~'; // Place Holder for nothing.
			}
		}
		System.out.println("Blistering Barnacles");
		System.out.println("Thundering Typhoons!");

		iterateThroughBoard(board);

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main();
			}
		});
	}
}