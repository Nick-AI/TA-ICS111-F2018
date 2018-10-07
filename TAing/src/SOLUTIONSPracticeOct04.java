import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SOLUTIONSPracticeOct04 {

    public static void main(String[] args) throws IOException {
        //Scanners:
        //can read from different input sources
        String filePath = "scan_me.txt";
        Scanner keyboardSc = new Scanner(new BufferedInputStream(System.in));
        Scanner fileSc = new Scanner(new FileReader(filePath));

        //Read from keyboard:
        System.out.println("Say something");
        String user_inp = keyboardSc.nextLine();
        //.nextInt(), .next(), .nextDouble(), etc.
        System.out.println(user_inp);

        //write a function that takes as input a String specifying a file name and prints out every line of the file
        filePrint("sample.txt");

        //look at the students.txt file
        //create a function that reads the file and puts its contents into two arrays
        //one array should contain all of the student names
        //the other one should contain all of the student's grades
        //the function should print out all of the student's names next to their grades
        //lastly, the function should return the array containing the grades
        double[] grades = getStudentGrades("students.txt");

        //take the array of grades and compute the average grade using a for loop
        int sum = 0;
        for(int i=0; i<grades.length; i++){
            sum += grades[i];
        }
        double avg = sum / grades.length;
        //then print out the average grade as a decimal as well as the corresponding letter grade

        switch((int)avg/10) {
            case 10: case 9:  //if((int)(avg/10) == 10) //else if((int)(avg/10) == 9)
                System.out.println(avg + "A");
                break;
            case 8:  //else if((int)(avg/10) == 8)
                System.out.println(avg + ": B");
                break;
            case 7:  //else if((int)(avg/10) == 7)
                System.out.println(avg + ": C");
                break;
            case 6:
                System.out.println(avg + ": D");
                break;
            default:  // else
                System.out.println(avg + ": F");
        }
        keyboardSc.close();
        fileSc.close();
    }

    public static double[] getStudentGrades(String fileDir) throws IOException {
        Scanner fileSc = new Scanner(new FileReader(fileDir));
        String[] names = new String[7];
        double[] grades = new double[7];
        int idx = 0;

        while(fileSc.hasNextDouble()){
            grades[idx] = fileSc.nextDouble();
            idx++;
        }
        idx = 0;
        fileSc.nextLine();

        while(fileSc.hasNextLine()){
            names[idx] = fileSc.nextLine();
            idx++;
        }
        fileSc.close();

        for(idx=0; idx<grades.length; idx++){
            System.out.println(names[idx] + "'s grade: " + grades[idx]);
        }
        return grades;
    }

    public static void filePrint(String fileDir) throws FileNotFoundException{
        Scanner fileSc = new Scanner(new FileReader(fileDir));
        while(fileSc.hasNextLine())
            System.out.println(fileSc.nextLine());
        fileSc.close();
    }
}
