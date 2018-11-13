import java.util.Arrays;
import java.util.Random;

public class PracticeNov13 {

	public static void main(String[] args) {
		int[][] sample = { { 1, 2, 3, 4, 5 }, 
				{ 5, 6, 7, 8, 9, 10 }, 
				{ -1, 23, 3 }, 
				{ 0 } };
		// What items are held at the following positions?
		// sample[3]
		// sample[2][2]
		// sample[1][3]
		
		// print all of the items in the sample array
		
		// put all of the items in the sample array into a 1D arraylist
		// remove the -1 from the arraylist by using the .indexOf() method and .remove() method
		
		//put all elements in the arraylist in a new 2D array with the dimensions [2][7]
		
		

		
		
		//4-Queens Problem (https://en.wikipedia.org/wiki/Eight_queens_puzzle): 
		char[][] chess;
		Queen[] queens;
		boolean isValid;
		int boardCount = 0;
		
		//generate boards until a valid one is found
		do{		
			Random rng = new Random();
			//create a 4x4 empty chess board
			chess = new char[4][4];
			for(int r=0; r<chess.length; r++){
				for(int c=0; c<chess[r].length; c++){
					chess[c][r] = '-';
				}
			}
			
			queens = new Queen[4];
			//put one queen in each row and store the location of that queen in the queens array
			for(int r=0; r<chess.length; r++){
				int c = rng.nextInt(4);
				chess[r][c] = 'Q';
				queens[r] = new Queen(r, c);
			} 
			
			//check if the board configuration is without conflicts
			isValid = true;
			checkLoop:
			for(int i=0; i<queens.length; i++){
				Queen temp = queens[i];
				for(int j=i+1; j<queens.length; j++){
					Queen other = queens[j];
					//straight collisions
					if(other.row == temp.row || other.col == temp.col){
						isValid = false;
						break checkLoop;
					}
					//diagonal collisions
					double diffRow = Math.abs(temp.row - other.row);
					double diffCol = Math.abs(temp.col - other.col);
					if(diffRow == diffCol){
						isValid = false;
						break checkLoop;
					}
				}
			}
			boardCount ++;
			
			System.out.println("Boards checked: " + boardCount);
			//ternary operator works as follows: [booleanCondition ? valueIfTrue : valueIfFalse]
			System.out.println("A" + (isValid ? " valid" : "n invalid") + " board:");
			//show the board
			for(char[] row: chess){
				System.out.println(Arrays.toString(row));
			}
			
		}while(!isValid);

	}
	
	private static class Queen{
		public int row, col;
		public Queen(int row, int col){
			this.row = row;
			this.col = col;
		}
		public String toString(){
			return "R: " + row + " C: " + col;
		}
	}
}