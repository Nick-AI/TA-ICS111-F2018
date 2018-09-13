
public class Quiz1Prep {

	public static void main(String[] args){
		
		//write a while loop to count from 1 to 50 in threes and printing only the numbers that are even numbers
		int counter = 1;
		while(counter<51){
			if(counter%2==0)
				System.out.println(counter);
			counter++;
		}
		
		//BONUS: write a program to print out a triangle like the following (One buffer point for quizzes if needed.)
//		  |\
//		  | \
//		  |  \
//		  |   \
//		  |    \
//		  ------
		int line_count = 0;
		int space_count;
		while(line_count<5){
			space_count = 0;
			System.out.print("|");
			while(space_count<line_count){
				System.out.print(" ");
				space_count++;
			}
			System.out.println("\\");
			line_count++;
		}
		System.out.println("------");
		
		int depth = 10;
		line_count = 0;
		String space = "", bottom = "-";
		while(line_count<depth){
			System.out.print("|");
			System.out.println(space + "\\");
			space += " ";
			line_count++;
			bottom += "-";
		}
		System.out.println(bottom);
	}
}
