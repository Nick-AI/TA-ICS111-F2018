import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class PracticeNov01 {

	public static void main(String[] args) throws IOException{
		// use the student class that we have created previously
		//(you can find the class at tinyurl.com/ics111-practice -> SOLUTIONSStudent.java)
		
		//Create a loop
		//Using a scanner in that loop, let a user create new Students by typing in their names and IDs
		//There shouldn't be a limit to how many students they can create. 
		//Store each student as a line in a text file called storage.txt
		
		//Once the user is done entering Students, read the file and store all students in an array
		//use the code below to find how many students are stored in the file
		LineNumberReader lr = new LineNumberReader(new FileReader("storage.txt"));
		lr.skip(Long.MAX_VALUE);
		int num_students = lr.getLineNumber()+1;
		lr.close();
		
		//divide the students into two equally large groups of students
		
		//Write the groups to your file in 2 lines like so:
		//"Group 1: Name1, Name2, Name3, ..."
		//"Group 2: Name1, Name 2, Name 3, ..."
	}
}
