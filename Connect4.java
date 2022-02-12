import processing.core.PApplet;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.Objects;

public class Connect4 extends PApplet {


	public void settings() {
		size(700, 700);
	}

	private boolean redraw = false;
	private boolean start = true;
	private PImage img;
	private PImage img_green;
	private PImage img_red;
	private ArrayList<ArrayList<Integer>> board = generateBoard();
	private int currentPlayer = 1;
	private boolean randomSelect = false;
	private boolean humanSelect = false;
	private RandomPlayer opponent = new RandomPlayer();
	private int turn = opponent.takeTurn();

	public void setup() {
		background(0);
		//noLoop();

		img = loadImage("connect4.png");
		img_green = loadImage("Green_circle.jpeg");
		img_red = loadImage("Red_Circle.png");
	}

	public static ArrayList<ArrayList<Integer>> generateBoard() {
		ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 6; i++) {
			ArrayList<Integer> temp_list = new ArrayList<Integer>();
			for (int j = 0; j < 7; j++)
				temp_list.add(0);
			board.add(temp_list);
		}

		return board;
	}

	public static void displayBoard(ArrayList<ArrayList<Integer>> board) {
		for (ArrayList<Integer> current : board) {
			System.out.print(current);
			System.out.print("\n");
		}
	}
	public static void updateBoard(int row, int col, int player, ArrayList<ArrayList<Integer>> board){
		board.get(row-1).set(col-1, player);
	}
	public boolean checkWinner(String player, ArrayList<ArrayList<Integer>> board) {
		// Horizontal Victories Row 1
		if ((board.get(0).get(0) != 0) & (Objects.equals(board.get(0).get(0), board.get(0).get(1)))  & (Objects.equals(board.get(0).get(0), board.get(0).get(2))) & (Objects.equals(board.get(0).get(0), board.get(0).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(1) != 0) & (Objects.equals(board.get(0).get(1), board.get(0).get(2)))  & (Objects.equals(board.get(0).get(1), board.get(0).get(3))) & (Objects.equals(board.get(0).get(1), board.get(0).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(2) != 0) & (Objects.equals(board.get(0).get(2), board.get(0).get(3)))  & (Objects.equals(board.get(0).get(2), board.get(0).get(4))) & (Objects.equals(board.get(0).get(2), board.get(0).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(3) != 0) & (Objects.equals(board.get(0).get(3), board.get(0).get(4)))  & (Objects.equals(board.get(0).get(3), board.get(0).get(5))) & (Objects.equals(board.get(0).get(3), board.get(0).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Horizontal Victories Row 2
		else if ((board.get(1).get(0) != 0) & (Objects.equals(board.get(1).get(0), board.get(1).get(1)))  & (Objects.equals(board.get(1).get(0), board.get(1).get(2))) & (Objects.equals(board.get(1).get(0), board.get(1).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(1) != 0) & (Objects.equals(board.get(1).get(1), board.get(1).get(2)))  & (Objects.equals(board.get(1).get(1), board.get(1).get(3))) & (Objects.equals(board.get(1).get(1), board.get(1).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(2) != 0) & (Objects.equals(board.get(1).get(2), board.get(1).get(3)))  & (Objects.equals(board.get(1).get(2), board.get(1).get(4))) & (Objects.equals(board.get(1).get(2), board.get(1).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(3) != 0) & (Objects.equals(board.get(1).get(3), board.get(1).get(4)))  & (Objects.equals(board.get(1).get(3), board.get(1).get(5))) & (Objects.equals(board.get(1).get(3), board.get(1).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Horizontal Victories Row 3
		else if ((board.get(2).get(0) != 0) & (Objects.equals(board.get(2).get(0), board.get(1).get(1)))  & (Objects.equals(board.get(2).get(0), board.get(2).get(2))) & (Objects.equals(board.get(2).get(0), board.get(2).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(1) != 0) & (Objects.equals(board.get(2).get(1), board.get(1).get(2)))  & (Objects.equals(board.get(2).get(1), board.get(2).get(3))) & (Objects.equals(board.get(2).get(1), board.get(2).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(2) != 0) & (Objects.equals(board.get(2).get(2), board.get(1).get(3)))  & (Objects.equals(board.get(2).get(2), board.get(2).get(4))) & (Objects.equals(board.get(2).get(2), board.get(2).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(3) != 0) & (Objects.equals(board.get(2).get(3), board.get(1).get(4)))  & (Objects.equals(board.get(2).get(3), board.get(2).get(5))) & (Objects.equals(board.get(2).get(3), board.get(2).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Horizontal Victories Row 4
		else if ((board.get(3).get(0) != 0) & (Objects.equals(board.get(3).get(0), board.get(3).get(1)))  & (Objects.equals(board.get(3).get(0), board.get(3).get(2))) & (Objects.equals(board.get(3).get(0), board.get(3).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(3).get(1) != 0) & (Objects.equals(board.get(3).get(1), board.get(3).get(2)))  & (Objects.equals(board.get(3).get(1), board.get(3).get(3))) & (Objects.equals(board.get(3).get(1), board.get(3).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(3).get(2) != 0) & (Objects.equals(board.get(3).get(2), board.get(3).get(3)))  & (Objects.equals(board.get(3).get(2), board.get(3).get(4))) & (Objects.equals(board.get(3).get(2), board.get(3).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(3).get(3) != 0) & (Objects.equals(board.get(3).get(3), board.get(3).get(4)))  & (Objects.equals(board.get(3).get(3), board.get(3).get(5))) & (Objects.equals(board.get(3).get(3), board.get(3).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Horizontal Victories Row 5
		else if ((board.get(4).get(0) != 0) & (Objects.equals(board.get(4).get(0), board.get(4).get(1)))  & (Objects.equals(board.get(4).get(0), board.get(4).get(2))) & (Objects.equals(board.get(4).get(0), board.get(4).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(4).get(1) != 0) & (Objects.equals(board.get(4).get(1), board.get(4).get(2)))  & (Objects.equals(board.get(4).get(1), board.get(4).get(3))) & (Objects.equals(board.get(4).get(1), board.get(4).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(4).get(2) != 0) & (Objects.equals(board.get(4).get(2), board.get(4).get(3)))  & (Objects.equals(board.get(4).get(2), board.get(4).get(4))) & (Objects.equals(board.get(4).get(2), board.get(4).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(4).get(3) != 0) & (Objects.equals(board.get(4).get(3), board.get(4).get(4)))  & (Objects.equals(board.get(4).get(3), board.get(4).get(5))) & (Objects.equals(board.get(4).get(3), board.get(4).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Horizontal Victories Row 6 (LAST)
		else if ((board.get(5).get(0) != 0) & (Objects.equals(board.get(5).get(0), board.get(5).get(1)))  & (Objects.equals(board.get(5).get(0), board.get(5).get(2))) & (Objects.equals(board.get(5).get(0), board.get(5).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(5).get(1) != 0) & (Objects.equals(board.get(5).get(1), board.get(5).get(2)))  & (Objects.equals(board.get(5).get(1), board.get(5).get(3))) & (Objects.equals(board.get(5).get(1), board.get(5).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(5).get(2) != 0) & (Objects.equals(board.get(5).get(2), board.get(5).get(3)))  & (Objects.equals(board.get(5).get(2), board.get(5).get(4))) & (Objects.equals(board.get(5).get(2), board.get(5).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(4).get(3) != 0) & (Objects.equals(board.get(4).get(3), board.get(3).get(4)))  & (Objects.equals(board.get(4).get(3), board.get(4).get(5))) & (Objects.equals(board.get(4).get(3), board.get(4).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		// Vertical Victories Column 1
		else if ((board.get(0).get(0) != 0) & (Objects.equals(board.get(0).get(0), board.get(1).get(0)))  & (Objects.equals(board.get(0).get(0), board.get(2).get(0))) & (Objects.equals(board.get(0).get(0), board.get(3).get(0)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(0) != 0) & (Objects.equals(board.get(1).get(0), board.get(2).get(0)))  & (Objects.equals(board.get(1).get(0), board.get(3).get(0))) & (Objects.equals(board.get(1).get(0), board.get(4).get(0)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(0) != 0) & (Objects.equals(board.get(2).get(0), board.get(3).get(0)))  & (Objects.equals(board.get(2).get(0), board.get(4).get(0))) & (Objects.equals(board.get(2).get(0), board.get(5).get(0)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Vertical Victories Column 2
		else if ((board.get(0).get(1) != 0) & (Objects.equals(board.get(0).get(1), board.get(1).get(1)))  & (Objects.equals(board.get(0).get(1), board.get(2).get(1))) & (Objects.equals(board.get(0).get(1), board.get(3).get(1)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(1) != 0) & (Objects.equals(board.get(1).get(1), board.get(2).get(1)))  & (Objects.equals(board.get(1).get(1), board.get(3).get(1))) & (Objects.equals(board.get(1).get(1), board.get(4).get(1)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(1) != 0) & (Objects.equals(board.get(2).get(1), board.get(3).get(1)))  & (Objects.equals(board.get(2).get(1), board.get(4).get(1))) & (Objects.equals(board.get(2).get(1), board.get(5).get(1)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Vertical Victories Column 3
		else if ((board.get(0).get(2) != 0) & (Objects.equals(board.get(0).get(2), board.get(1).get(2)))  & (Objects.equals(board.get(0).get(2), board.get(2).get(2))) & (Objects.equals(board.get(0).get(2), board.get(3).get(2)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(2) != 0) & (Objects.equals(board.get(1).get(2), board.get(2).get(2)))  & (Objects.equals(board.get(1).get(2), board.get(3).get(2))) & (Objects.equals(board.get(1).get(2), board.get(4).get(2)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(2) != 0) & (Objects.equals(board.get(2).get(2), board.get(3).get(2)))  & (Objects.equals(board.get(2).get(2), board.get(4).get(2))) & (Objects.equals(board.get(2).get(2), board.get(5).get(2)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Vertical Victories Column 4
		else if ((board.get(0).get(3) != 0) & (Objects.equals(board.get(0).get(3), board.get(1).get(3)))  & (Objects.equals(board.get(0).get(3), board.get(2).get(3))) & (Objects.equals(board.get(0).get(3), board.get(3).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(3) != 0) & (Objects.equals(board.get(1).get(3), board.get(2).get(3)))  & (Objects.equals(board.get(1).get(3), board.get(3).get(3))) & (Objects.equals(board.get(1).get(3), board.get(4).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(3) != 0) & (Objects.equals(board.get(2).get(3), board.get(3).get(3)))  & (Objects.equals(board.get(2).get(3), board.get(4).get(3))) & (Objects.equals(board.get(2).get(3), board.get(5).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Vertical Victories Column 5
		else if ((board.get(0).get(4) != 0) & (Objects.equals(board.get(0).get(4), board.get(1).get(4)))  & (Objects.equals(board.get(0).get(4), board.get(2).get(4))) & (Objects.equals(board.get(0).get(4), board.get(3).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(4) != 0) & (Objects.equals(board.get(1).get(4), board.get(2).get(4)))  & (Objects.equals(board.get(1).get(4), board.get(3).get(4))) & (Objects.equals(board.get(1).get(4), board.get(4).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(4) != 0) & (Objects.equals(board.get(2).get(4), board.get(3).get(4)))  & (Objects.equals(board.get(2).get(4), board.get(4).get(4))) & (Objects.equals(board.get(2).get(4), board.get(5).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Vertical Victories Column 6
		else if ((board.get(0).get(5) != 0) & (Objects.equals(board.get(0).get(5), board.get(1).get(5)))  & (Objects.equals(board.get(0).get(5), board.get(2).get(5))) & (Objects.equals(board.get(0).get(5), board.get(3).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(5) != 0) & (Objects.equals(board.get(1).get(5), board.get(2).get(5)))  & (Objects.equals(board.get(1).get(5), board.get(3).get(5))) & (Objects.equals(board.get(1).get(5), board.get(4).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(5) != 0) & (Objects.equals(board.get(2).get(5), board.get(3).get(5)))  & (Objects.equals(board.get(2).get(5), board.get(4).get(5))) & (Objects.equals(board.get(2).get(5), board.get(5).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Vertical Victories Column 7
		else if ((board.get(0).get(6) != 0) & (Objects.equals(board.get(0).get(6), board.get(1).get(6)))  & (Objects.equals(board.get(0).get(6), board.get(2).get(6))) & (Objects.equals(board.get(0).get(6), board.get(3).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(6) != 0) & (Objects.equals(board.get(1).get(6), board.get(2).get(6)))  & (Objects.equals(board.get(1).get(6), board.get(3).get(6))) & (Objects.equals(board.get(1).get(6), board.get(4).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(6) != 0) & (Objects.equals(board.get(2).get(6), board.get(3).get(6)))  & (Objects.equals(board.get(2).get(6), board.get(4).get(6))) & (Objects.equals(board.get(2).get(6), board.get(5).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		// Diagonal Victories Row 1
		else if ((board.get(0).get(0) != 0) & (Objects.equals(board.get(0).get(0), board.get(1).get(1)))  & (Objects.equals(board.get(0).get(0), board.get(2).get(2))) & (Objects.equals(board.get(0).get(0), board.get(3).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(1) != 0) & (Objects.equals(board.get(0).get(1), board.get(1).get(2)))  & (Objects.equals(board.get(0).get(1), board.get(2).get(3))) & (Objects.equals(board.get(0).get(1), board.get(3).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(2) != 0) & (Objects.equals(board.get(0).get(2), board.get(1).get(3)))  & (Objects.equals(board.get(0).get(2), board.get(2).get(4))) & (Objects.equals(board.get(0).get(2), board.get(3).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(3) != 0) & (Objects.equals(board.get(0).get(3), board.get(1).get(4)))  & (Objects.equals(board.get(0).get(3), board.get(2).get(5))) & (Objects.equals(board.get(0).get(3), board.get(3).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(3) != 0) & (Objects.equals(board.get(0).get(3), board.get(1).get(2)))  & (Objects.equals(board.get(0).get(3), board.get(2).get(1))) & (Objects.equals(board.get(0).get(3), board.get(3).get(0)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(4) != 0) & (Objects.equals(board.get(0).get(4), board.get(1).get(3)))  & (Objects.equals(board.get(0).get(4), board.get(2).get(2))) & (Objects.equals(board.get(0).get(4), board.get(3).get(1)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(5) != 0) & (Objects.equals(board.get(0).get(5), board.get(1).get(4)))  & (Objects.equals(board.get(0).get(5), board.get(2).get(3))) & (Objects.equals(board.get(0).get(5), board.get(3).get(2)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(0).get(6) != 0) & (Objects.equals(board.get(0).get(6), board.get(1).get(5)))  & (Objects.equals(board.get(0).get(6), board.get(2).get(4))) & (Objects.equals(board.get(0).get(6), board.get(3).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Diagonal Victories Row 2
		else if ((board.get(1).get(0) != 0) & (Objects.equals(board.get(1).get(0), board.get(2).get(1)))  & (Objects.equals(board.get(1).get(0), board.get(3).get(2))) & (Objects.equals(board.get(1).get(0), board.get(4).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(1) != 0) & (Objects.equals(board.get(1).get(1), board.get(2).get(2)))  & (Objects.equals(board.get(1).get(1), board.get(3).get(3))) & (Objects.equals(board.get(1).get(1), board.get(4).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(2) != 0) & (Objects.equals(board.get(1).get(2), board.get(2).get(3)))  & (Objects.equals(board.get(1).get(2), board.get(3).get(4))) & (Objects.equals(board.get(1).get(2), board.get(4).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(3) != 0) & (Objects.equals(board.get(1).get(3), board.get(2).get(4)))  & (Objects.equals(board.get(1).get(3), board.get(3).get(5))) & (Objects.equals(board.get(1).get(3), board.get(4).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(3) != 0) & (Objects.equals(board.get(1).get(3), board.get(2).get(2)))  & (Objects.equals(board.get(1).get(3), board.get(3).get(1))) & (Objects.equals(board.get(1).get(3), board.get(4).get(0)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(4) != 0) & (Objects.equals(board.get(1).get(4), board.get(2).get(3)))  & (Objects.equals(board.get(4).get(3), board.get(3).get(2))) & (Objects.equals(board.get(4).get(3), board.get(4).get(1)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(5) != 0) & (Objects.equals(board.get(1).get(5), board.get(2).get(4)))  & (Objects.equals(board.get(1).get(5), board.get(3).get(3))) & (Objects.equals(board.get(1).get(5), board.get(4).get(2)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(1).get(6) != 0) & (Objects.equals(board.get(1).get(6), board.get(2).get(5)))  & (Objects.equals(board.get(1).get(6), board.get(3).get(4))) & (Objects.equals(board.get(1).get(6), board.get(4).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}
		// Diagonal Victories Row 3
		else if ((board.get(2).get(0) != 0) & (Objects.equals(board.get(2).get(0), board.get(3).get(1)))  & (Objects.equals(board.get(2).get(0), board.get(4).get(2))) & (Objects.equals(board.get(2).get(0), board.get(5).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(1) != 0) & (Objects.equals(board.get(2).get(1), board.get(3).get(2)))  & (Objects.equals(board.get(2).get(1), board.get(4).get(3))) & (Objects.equals(board.get(2).get(1), board.get(5).get(4)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(2) != 0) & (Objects.equals(board.get(2).get(2), board.get(3).get(3)))  & (Objects.equals(board.get(2).get(2), board.get(4).get(4))) & (Objects.equals(board.get(2).get(2), board.get(5).get(5)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(3) != 0) & (Objects.equals(board.get(2).get(3), board.get(3).get(4)))  & (Objects.equals(board.get(2).get(3), board.get(4).get(5))) & (Objects.equals(board.get(2).get(3), board.get(5).get(6)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(3) != 0) & (Objects.equals(board.get(2).get(3), board.get(3).get(2)))  & (Objects.equals(board.get(2).get(3), board.get(4).get(1))) & (Objects.equals(board.get(2).get(3), board.get(5).get(0)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(4) != 0) & (Objects.equals(board.get(2).get(4), board.get(3).get(3)))  & (Objects.equals(board.get(2).get(4), board.get(4).get(2))) & (Objects.equals(board.get(2).get(4), board.get(5).get(1)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(5) != 0) & (Objects.equals(board.get(2).get(5), board.get(3).get(4)))  & (Objects.equals(board.get(2).get(5), board.get(4).get(3))) & (Objects.equals(board.get(2).get(5), board.get(5).get(2)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		else if ((board.get(2).get(6) != 0) & (Objects.equals(board.get(2).get(6), board.get(3).get(5)))  & (Objects.equals(board.get(2).get(6), board.get(4).get(4))) & (Objects.equals(board.get(2).get(6), board.get(5).get(3)))){
			text(player + " wins!", 300, 70);
			System.out.println(player + " wins!");
			exit();
			return true;}

		return false;
	}

	public static boolean checkColumnFull(int col, ArrayList<ArrayList<Integer>> board) {
		if (board.get(0).get(col-1) == 1 || board.get(0).get(col-1) == 2)
			return true;

		return false;
	}

	public static int findSpot(int col, ArrayList<ArrayList<Integer>> board) {
		int count = 1;
		for (int i = board.size(); i-- > 0; ) {
			if (board.get(i).get(col-1) == 0)
				return count;
			count ++;
		}
		return 7;
	}

	public void draw() {
		if (start) {
			textSize(30);
			text("Welcome to Connect 4!", 170, 250);
			fill(0, 102, 153);
			text("Click to start playing", 190, 300);
			fill(0, 102, 153, 51);
			start = false;
		}

		if (redraw) {
			background(0);//reset background to graph
			image(img, 100, 200);
			textSize(18);
			fill(0, 102, 153, 255);
			text("Choose your Opponent:", 10, 30);
			text("Random Player", 40, 70);
			text("Human Player (Friend)", 40, 110);
		redraw = false;
		}

		}

  	public void mousePressed() {
		if ((mouseX >= 40) & (mouseX <= 210) & (mouseY >= 100) & (mouseY <= 115) & (!start) & (!humanSelect)) { // User selection human opponent
			background(0);//reset background to gray
			image(img, 100, 200);
			System.out.println("You have chosen a human player opponent.");
			humanSelect = true;
			redraw = false;
			this.currentPlayer = 1;
		}
		else if ((mouseX >= 100) & (mouseX < 170) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 1
			boolean full = checkColumnFull(1, this.board);
			if (!full) {
				int row = findSpot(1, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 110, 210);
						updateBoard(1, 1, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 110, 210);
						updateBoard(1, 1, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
						}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 110, 280);
						updateBoard(2, 1, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 110, 280);
						updateBoard(2, 1, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 110, 350);
						updateBoard(3, 1, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 110, 350);
						updateBoard(3, 1, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 110, 420);
						updateBoard(4, 1, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 110, 420);
						updateBoard(4, 1, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 110, 490);
						updateBoard(5, 1, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 110, 490);
						updateBoard(5, 1, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 110, 560);
						updateBoard(6, 1, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 110, 560);
						updateBoard(6, 1, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}


		else if ((mouseX >= 170) & (mouseX < 240) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 2!!!
			boolean full = checkColumnFull(2, this.board);
			if (!full) {
				int row = findSpot(2, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 180, 210);
						updateBoard(1, 2, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 180, 210);
						updateBoard(1, 2, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 180, 280);
						updateBoard(2, 2, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 180, 280);
						updateBoard(2, 2, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 180, 350);
						updateBoard(3, 2, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 180, 350);
						updateBoard(3, 2, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 180, 420);
						updateBoard(4, 2, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 180, 420);
						updateBoard(4, 2, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 180, 490);
						updateBoard(5, 2, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 180, 490);
						updateBoard(5, 2, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 180, 560);
						updateBoard(6, 2, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 180, 560);
						updateBoard(6, 2, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}


		else if ((mouseX >= 240) & (mouseX < 310) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 3!!!
			boolean full = checkColumnFull(3, this.board);
			if (!full) {
				int row = findSpot(3, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 250, 210);
						updateBoard(1, 3, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 250, 210);
						updateBoard(1, 3, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 250, 280);
						updateBoard(2, 3, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 250, 280);
						updateBoard(2, 3, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 250, 350);
						updateBoard(3, 3, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 250, 350);
						updateBoard(3, 3, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 250, 420);
						updateBoard(4, 3, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 250, 420);
						updateBoard(4, 3, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 250, 490);
						updateBoard(5, 3, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 250, 490);
						updateBoard(5, 3, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 250, 560);
						updateBoard(6, 3, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 250, 560);
						updateBoard(6, 3, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}


		else if ((mouseX >= 310) & (mouseX < 380) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 4!!!
			boolean full = checkColumnFull(4, this.board);
			if (!full) {
				int row = findSpot(4, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 320, 210);
						updateBoard(1, 4, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 320, 210);
						updateBoard(1, 4, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 320, 280);
						updateBoard(2, 4, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 320, 280);
						updateBoard(2, 4, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 320, 350);
						updateBoard(3, 4, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 320, 350);
						updateBoard(3, 4, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 320, 420);
						updateBoard(4, 4, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 320, 420);
						updateBoard(4, 4, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 320, 490);
						updateBoard(5, 4, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 320, 490);
						updateBoard(5, 4, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 320, 560);
						updateBoard(6, 4, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 320, 560);
						updateBoard(6, 4, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}


		else if ((mouseX >= 380) & (mouseX < 450) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 5!!!
			boolean full = checkColumnFull(5, this.board);
			if (!full) {
				int row = findSpot(5, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 390, 210);
						updateBoard(1, 5, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 390, 210);
						updateBoard(1, 5, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 390, 280);
						updateBoard(2, 5, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 390, 280);
						updateBoard(2, 5, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 390, 350);
						updateBoard(3, 5, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 390, 350);
						updateBoard(3, 5, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 390, 420);
						updateBoard(4, 5, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 390, 420);
						updateBoard(4, 5, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 390, 490);
						updateBoard(5, 5, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 390, 490);
						updateBoard(5, 5, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 390, 560);
						updateBoard(6, 5, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 390, 560);
						updateBoard(6, 5, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}


		else if ((mouseX >= 450) & (mouseX < 520) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 6!!!
			boolean full = checkColumnFull(6, this.board);
			if (!full) {
				int row = findSpot(6, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 460, 210);
						updateBoard(1, 6, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 460, 210);
						updateBoard(1, 6, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 460, 280);
						updateBoard(2, 6, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 460, 280);
						updateBoard(2, 6, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 460, 350);
						updateBoard(3, 6, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 460, 350);
						updateBoard(3, 6, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 460, 420);
						updateBoard(4, 6, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 460, 420);
						updateBoard(4, 6, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 460, 490);
						updateBoard(5, 6, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 460, 490);
						updateBoard(5, 6, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 460, 560);
						updateBoard(6, 6, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 460, 560);
						updateBoard(6, 6, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}


		else if ((mouseX >= 520) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (humanSelect)) { // PvP Player chooses column 7!!!
			boolean full = checkColumnFull(7, this.board);
			if (!full) {
				int row = findSpot(7, this.board); // If and else if statements needed for each row
				if (row == 6) {
					if (this.currentPlayer == 1){
						image(img_green, 530, 210);
						updateBoard(1, 7, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 530, 210);
						updateBoard(1, 7, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 5){
					if (this.currentPlayer == 1) {
						image(img_green, 530, 280);
						updateBoard(2, 7, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 530, 280);
						updateBoard(2, 7, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 4){
					if (this.currentPlayer == 1) {
						image(img_green, 530, 350);
						updateBoard(3, 7, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 530, 350);
						updateBoard(3, 7, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}


				else if (row == 3){
					if (this.currentPlayer == 1) {
						image(img_green, 530, 420);
						updateBoard(4, 7, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 530, 420);
						updateBoard(4, 7, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}

				else if (row == 2) {
					if (this.currentPlayer == 1) {
						image(img_green, 530, 490);
						updateBoard(5, 7, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2) {
						image(img_red, 530, 490);
						updateBoard(5, 7, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				else if (row == 1) {
					if (this.currentPlayer == 1){
						image(img_green, 530, 560);
						updateBoard(6, 7, 1, board);
						checkWinner("Player 1", board);
						this.currentPlayer = 2;
					}
					else if (this.currentPlayer == 2){
						image(img_red, 530, 560);
						updateBoard(6, 7, 2, board);
						checkWinner("Player 2", board);
						this.currentPlayer = 1;
					}
				}
				redraw = false;
			}

		}



		else if ((mouseX >= 40) & (mouseX <= 155) & (mouseY >= 60) & (mouseY <= 75) & (!start) & (!randomSelect)) { // User chooses a random player opponent
			background(0);//reset background to gray
			image(img, 100, 200);
			System.out.println("You have chosen a random player opponent.");
			randomSelect = true;
			redraw = false;
			this.currentPlayer = 1;
		}



		else if ((mouseX >= 100) & (mouseX < 170) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 1
			boolean full = checkColumnFull(1, this.board);
			if (!full) {
				int row = findSpot(1, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 110, 210);
					updateBoard(1, 1, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
					}
				else if (row == 5){
					image(img_green, 110, 280);
					updateBoard(2, 1, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 110, 350);
					updateBoard(3, 1, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 110, 420);
					updateBoard(4, 1, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 110, 490);
					updateBoard(5, 1, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 1){
					image(img_green, 110, 560);
					updateBoard(6, 1, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
			}


		else if ((mouseX >= 170) & (mouseX < 240) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 2
			boolean full = checkColumnFull(2, this.board);
			if (!full) {
				int row = findSpot(2, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 180, 210);
					updateBoard(1, 2, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 5){
					image(img_green, 180, 280);
					updateBoard(2, 2, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 180, 350);
					updateBoard(3, 2, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 180, 420);
					updateBoard(4, 2, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 180, 490);
					updateBoard(5, 2, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 1){
					image(img_green, 180, 560);
					updateBoard(6, 2, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
		}


		else if ((mouseX >= 240) & (mouseX < 310) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 3
			boolean full = checkColumnFull(3, this.board);
			if (!full) {
				int row = findSpot(3, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 250, 210);
					updateBoard(1, 3, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 5){
					image(img_green, 250, 280);
					updateBoard(2, 3, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 250, 350);
					updateBoard(3, 3, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 250, 420);
					updateBoard(4, 3, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 250, 490);
					updateBoard(5, 3, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 1){
					image(img_green, 250, 560);
					updateBoard(6, 3, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
		}


		else if ((mouseX >= 310) & (mouseX < 380) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 4
			boolean full = checkColumnFull(4, this.board);
			if (!full) {
				int row = findSpot(4, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 320, 210);
					updateBoard(1, 4, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 5){
					image(img_green, 320, 280);
					updateBoard(2, 4, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 320, 350);
					updateBoard(3, 4, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 320, 420);
					updateBoard(4, 4, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 320, 490);
					updateBoard(5, 4, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 1){
					image(img_green, 320, 560);
					updateBoard(6, 4, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
		}


		else if ((mouseX >= 380) & (mouseX < 450) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 5
			boolean full = checkColumnFull(5, this.board);
			if (!full) {
				int row = findSpot(5, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 390, 210);
					updateBoard(1, 5, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 5){
					image(img_green, 390, 280);
					updateBoard(2, 5, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 390, 350);
					updateBoard(3, 5, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 390, 420);
					updateBoard(4, 5, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 390, 490);
					updateBoard(5, 5, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
				}
				else if (row == 1){
					image(img_green, 390, 560);
					updateBoard(6, 5, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
		}


		else if ((mouseX >= 450) & (mouseX < 520) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 6
			boolean full = checkColumnFull(6, this.board);
			if (!full) {
				int row = findSpot(6, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 460, 210);
					updateBoard(1, 6, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 5){
					image(img_green, 460, 280);
					updateBoard(2, 6, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 460, 350);
					updateBoard(3, 6, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 460, 420);
					updateBoard(4, 6, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 460, 490);
					updateBoard(5, 6, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 1){
					image(img_green, 460, 560);
					updateBoard(6, 6, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
		}


		else if ((mouseX >= 520) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (((randomSelect)&(this.currentPlayer==1)))) { // PvR Player chooses column 7
			boolean full = checkColumnFull(7, this.board);
			if (!full) {
				int row = findSpot(7, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_green, 530, 210);
					updateBoard(1, 7, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 5){
					image(img_green, 530, 280);
					updateBoard(2, 7, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 4){
					image(img_green, 530, 350);
					updateBoard(3, 7, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 3){
					image(img_green, 530, 420);
					updateBoard(4, 7, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 2){
					image(img_green, 530, 490);
					updateBoard(5, 7, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}
				else if (row == 1){
					image(img_green, 530, 560);
					updateBoard(6, 7, 1, board);
					checkWinner("Player 1", board);
					this.currentPlayer = 2;
					turn = opponent.takeTurn();
					while (checkColumnFull(turn, board)){
						turn = opponent.takeTurn();
					}
				}

			}
		}


		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 1)) { // Random opponent move in column 1
			boolean full = checkColumnFull(1, this.board);
			if (!full) {
				int row = findSpot(1, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 110, 210);
					updateBoard(1, 1, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 110, 280);
					updateBoard(2, 1, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
					}

				else if (row == 4){
					image(img_red, 110, 350);
					updateBoard(3, 1, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 110, 420);
					updateBoard(4, 1, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 110, 490);
					updateBoard(5, 1, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 110, 560);
					updateBoard(6, 1, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 2)) { // Random opponent move in column 2
			boolean full = checkColumnFull(2, this.board);
			if (!full) {
				int row = findSpot(2, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 180, 210);
					updateBoard(1, 2, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 180, 280);
					updateBoard(2, 2, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 4){
					image(img_red, 180, 350);
					updateBoard(3, 2, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 180, 420);
					updateBoard(4, 2, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 180, 490);
					updateBoard(5, 2, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 180, 560);
					updateBoard(6, 2, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 3)) { // Random opponent move in column 3
			boolean full = checkColumnFull(3, this.board);
			if (!full) {
				int row = findSpot(3, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 250, 210);
					updateBoard(1, 3, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 250, 280);
					updateBoard(2, 3, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 4){
					image(img_red, 250, 350);
					updateBoard(3, 3, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 250, 420);
					updateBoard(4, 3, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 250, 490);
					updateBoard(5, 3, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 250, 560);
					updateBoard(6, 3, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 4)) { // Random opponent move in column 4
			boolean full = checkColumnFull(4, this.board);
			if (!full) {
				int row = findSpot(4, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 320, 210);
					updateBoard(1, 4, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 320, 280);
					updateBoard(2, 4, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 4){
					image(img_red, 320, 350);
					updateBoard(3, 4, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 320, 420);
					updateBoard(4, 4, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 320, 490);
					updateBoard(5, 4, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 320, 560);
					updateBoard(6, 4, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 5)) { // Random opponent move in column 5
			boolean full = checkColumnFull(5, this.board);
			if (!full) {
				int row = findSpot(5, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 390, 210);
					updateBoard(1, 5, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 390, 280);
					updateBoard(2, 5, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 4){
					image(img_red, 390, 350);
					updateBoard(3, 5, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 390, 420);
					updateBoard(4, 5, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 390, 490);
					updateBoard(5, 5, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 390, 560);
					updateBoard(6, 5, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 6)) { // Random opponent move in column 6
			boolean full = checkColumnFull(6, this.board);
			if (!full) {
				int row = findSpot(6, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 460, 210);
					updateBoard(1, 6, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 460, 280);
					updateBoard(2, 6, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 4){
					image(img_red, 460, 350);
					updateBoard(3, 6, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 460, 420);
					updateBoard(4, 6, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 460, 490);
					updateBoard(5, 6, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 460, 560);
					updateBoard(6, 6, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else if ((mouseX >= 100) & (mouseX < 590) & (mouseY >= 200) & (mouseY <= 625) & (randomSelect) & (this.currentPlayer==2) & (turn == 7)) { // Random opponent move in column 7
			boolean full = checkColumnFull(7, this.board);
			if (!full) {
				int row = findSpot(7, this.board); // If and else if statements needed for each row
				if (row == 6) {
					image(img_red, 530, 210);
					updateBoard(1, 7, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 5){
					image(img_red, 530, 280);
					updateBoard(2, 7, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 4){
					image(img_red, 530, 350);
					updateBoard(3, 7, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 3){
					image(img_red, 530, 420);
					updateBoard(4, 7, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}

				else if (row == 2){
					image(img_red, 530, 490);
					updateBoard(5, 7, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;

				}
				else if (row == 1){
					image(img_red, 530, 560);
					updateBoard(6, 7, 2, board);
					checkWinner("Player 2", board);
					this.currentPlayer = 1;
				}
			}
		}

		else
			redraw = true;

	}

  	public static void main(String args[]) {
      PApplet.main("Connect4");


   }
}

