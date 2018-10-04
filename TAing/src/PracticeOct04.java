import java.io.BufferedInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class PracticeOct04 {

    public static void main(String[] args) throws java.io.FileNotFoundException {
        //Scanners:
        //can read from different input sources
        String filePath = "scane_me.txt";
        Scanner keyboardSc = new Scanner(new BufferedInputStream(System.in));
        Scanner fileSc = new Scanner(new FileReader(filePath));

        //Read from keyboard:
        System.out.println("Say something");
        String user_inp = keyboardSc.nextLine();
        //.nextInt(), .next(), .nextDouble(), etc.
        System.out.println(user_inp);

        //write a function that takes as input a String specifying a file name and prints out every line of the file
        filePrint("scan_me.txt");
        filePrint("sample.txt");

        //look at the students.txt file
        //create a function that reads the file and puts its contents into two arrays
        //one array should contain all of the student names
        //the other one should contain all of the student's grades
        //the function should print out all of the student's names next to their grades
        //lastly, the function should return the array containing the grades
        double[] grades = getStudentGrades("students.txt");

        //take the array of grades and compute the average grade using a for loop
        //then print out the average grade as a decimal as well as the corresponding letter grade



        double grade = 94.6;
        switch((int)grade/10) {
            case 10: case 9:  //if(int(grade/10) == 10) //else if(int(grade/10) == 9)
                System.out.println("A");
                break;
            case 8:  //else if(int(grade/10) == 8)
                System.out.println("B");
            case 7:  //else if(int(grade/10) == 7)
                System.out.println("C");
            case 6:
                System.out.println("D");
            default:  // else
                System.out.println("F");
        }
    }
}
