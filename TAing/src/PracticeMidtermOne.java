
public class PracticeMidtermOne {

	public static void main(String[] args){
		// What is the output of the following two lines of code?
		practiceOne();
		practiceTwo(7, "test ");
		
		int test = practiceThree(2, 3); // since java has no operator to calculate a^b (read: a to the power of b)
						// complete the function practiceThree to perform that calculation and return the result
		System.out.println(test); // this should print 8
	}
	
	public static void practiceOne(){
		int x = 7, count = 0;
		double y = 0.5;
		while(y*x>2){
			x--;
			y *= y;
			count += 3;
		}
		if(count%2 == 0){
			System.out.println("Divisible by two.");
		}
		else{
			System.out.println("Not divisible by two.");
		}
		if(y>0.1){
			System.out.println("One");
		}
		else if(y>0.01){
			System.out.println("Two");
		}
		else{
			System.out.println("Three");
		}
		
	}
	
	public static void practiceTwo(int repetitions, String sample){
		// print out the String as many times as the repetitions parameter tells you
		// On each even repetition (2nd, 4th, etc.), print the string twice, on every uneven repetition (i=1, 3, ...), print the string i number of times
		// e.g. for sample = "A" and repetitions = 5, print:
		// A
		// AA
		// AAA
		// AA
		// AAAAA
	}
	
	public static int practiceThree(){

	}
	
	
}
