
public class PracticeOct02 {

	public static void main(String[] args) {
		//write a function to get an array with the first x numbers of the fibonacci sequence
		int x = 10;
		int[] fibNums = getFibonacci(x);  
		
		//print out all of the elements in the array you just got
		
		//write a function to find the largest number in an array of positive numbers
		int[] nums = {2, 32, 1, 454, 231, 3, 1, 76};
		int max = findMax(nums);
		System.out.println(max);
		
		//What will this print?
		someFunction();
	}
	
	public static void someFunction(){
		int row = 5;
	    for(int i=1, star=1; i<=row; i++, star+=2){
	        for(int space=row; space>i; space--)
	            System.out.print(" ");
	        for(int j=1; j<=star; j++)
	            System.out.print("*");
	        System.out.println();
	    }
	}
}
