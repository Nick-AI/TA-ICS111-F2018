
public class Review1 {
	public static void main(String[] args){
		//while and do-while
		//For each number between 1 and 100, print whether it is even or odd
		int counter = 0;
		while(counter<100){
			 //Q1: Option a: 
			counter++;
			if(counter%2 == 0){
				// Q2: Option a: 
				System.out.println(counter + " is even.");
				// Q2: Option b: System.out.println(counter + " is odd.");
			}
			else{
				//Whatever wasn't the right answer for Q2.
				System.out.println(counter + " is odd.");
			}
			// Q1: Option b: count++;
		}
		
		// The specifics of how this code works are not important, it is essentially a problem that requires you to
		// count the variable 'unicode_letter' up from 65 to 91
		String alphabet = "";
		int unicode_letter = 64; //65 is unicode value of capital "A"
		do{
			// Q3: Option a: alphabet += (char)unicode_letter++;
			// Q3: Option b: 
			alphabet += (char)++unicode_letter;
		}while(alphabet.length()<26);
		System.out.println(alphabet);
		
		
		//if and conditionals
		int test_score = 83;
		if(test_score > 90){
			if(test_score > 100){
				System.out.println("Nerd.");
			}
			else{
				System.out.println("A, Good job!");
			}
		}
		// Q4: Option a: 
		else if(test_score > 80)
		// Q4: Option b: if(test_score > 80)
		{
			System.out.println("B");
		}
		else{
			System.out.println("You can do better.");
		}
		
		// Don't worry about the boolean datatype, just make sure you know that those variables hold only one of two
		// values, they are either true (1) or false (0)
		boolean isSunny, isHoliday, usedSunblock;
		isSunny = true;
		usedSunblock = !isSunny;
		isHoliday = !usedSunblock;
		// Q5: Option a:
		if((isSunny && usedSunblock && isHoliday) || !isSunny){
			System.out.println("Not today, cancer.");
		}
		// Q5: Option b:
		if(isSunny && !isHoliday){
			System.out.println("Have fun... inside.");
		}
		// Q5: Option c:
		if(isSunny && isHoliday && !usedSunblock){
			System.out.println("Enjoy the sunburn.");
		}
		
	}

}
