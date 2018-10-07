import java.util.Random;

public class ForLoopPractice {

    public static void main(String[] args){
        //create an integer array of size 10 and call it test

        //this creates a random number generator
        Random rand = new Random();
        //this is how you generate a random number between -500 and 500 with the random number generator
        System.out.println(rand.nextInt(1001)-500);

        //write a for loop that fills your integer array with random numbers between 1 and 1000

        //write a method that prints out all of the values in an array separated by commas
        printArr(test);

        //write the method findMin that should return the smallest number in your array
        int min = findMin(test);
        System.out.println(min);

        //now write a method that returns the index of the position in the array that holds the smallest value
        int minIdx = findMinPos(test);
        System.out.println(minIdx);

        //create a new array called help that holds the same number of items as your test array

        //write a for loop that fills the help array with the exact same values as in test only as negatives
        printArr(help);

        //write a method that takes two arrays as input and returns a single array consisting of all of the elements
        //from the two input arrays
        int[] comb = combineArrs(test, help);
        printArr(comb);

        //write a method that finds the average of all elements in an array and find the avg of the comb array
        double avg = getAvg(comb);
        System.out.println(avg);
    }
}
