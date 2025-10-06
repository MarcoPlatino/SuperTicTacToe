import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame implements ActionListener {
	private char[][] board;
	private JButton[] buttons;
	private boolean playerTurn = false; // 0 (false) for player 1, 1 (true) for player 2

	public static void iterateThroughBoard(char[][] board) { // Prints out the baord for testing
		for (int i = 0; i < board.length; i++) { // Note that it is not formatted!!
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();

		}
	}

	// public static void printOutBoardFormatted(char[][] board) {
	// System.out.println("Eventually the board will be printed out in a formatted
	// way!");
	// }

	public Main(char[][] board) {
		this.board = board; // Make board
		JFrame frame = new JFrame("RGBconverterGUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.setResizable(false); // Stays square

		JPanel contentpane = new JPanel();
		contentpane.setLayout(new GridLayout(9, 9)); // Set it as a grid lyaout 9x9 so it is square
														// Might have to be 10x10 for formatting or maybe more!!

		frame.setContentPane(contentpane);

		contentpane.setSize(new Dimension(500, 500));

		this.buttons = new JButton[81]; // List of buttons
		for (int i = 0; i < 81; i++) {
			int row = i / 9;
			int col = i % 9;
			String character = Character.toString(this.board[row][col]); // Initialzing buttons
			this.buttons[i] = new JButton(character);
			this.buttons[i].setActionCommand(i + "");
			this.buttons[i].addActionListener(this); // If color is ever wanting to be change just do it here
			frame.add(this.buttons[i]);
		}

		frame.pack();
		frame.setVisible(true);
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
		System.out.println("Thundering Typhoons!"); // Necessary print statements

		iterateThroughBoard(board);

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main(board);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent event) { // TODO Add some event listeners here then it can work!
		// TODO Add something here to handle the events!!!
		String eventName = event.getActionCommand();
		int indexOfButton = Integer.parseInt(eventName);

		if (this.buttons[indexOfButton].getText().equals("~")) {
			this.buttons[indexOfButton].setText("0"); //Added switching kind of

		}
	}
}