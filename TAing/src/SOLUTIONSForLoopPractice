import java.util.Random;

public class SOLUTIONSForLoopPractice {

    public static void main(String[] args){
        //create an integer array of size 10 and call it test
        int[] test = new int[10];

        //this creates a random number generator
        Random rand = new Random();
        //this is how you generate a random number between -500 and 500 with the random number generator
        System.out.println(rand.nextInt(1001)-500);

        //write a for loop that fills your integer array with random numbers between 1 and 1000
        for(int i=0; i<test.length; i++){
            test[i] = rand.nextInt(1000)+1;
        }

        //write a method that prints out all of the values in an array separated by commas
        printArr(test);

        //write the method findMin that should return the smallest number in your array
        int min = findMin(test);
        System.out.println(min);

        //now write a method that returns the index of the position in the array that holds the smallest value
        int minIdx = findMinPos(test);
        System.out.println(minIdx);

        //create a new array called help that holds the same number of items as your test array
        int[] help = new int[test.length];

        //write a for loop that fills the help array with the exact same values as in test only as negatives
        for(int i=0; i<help.length; i++){
            help[i] = test[i]*-1;
        }
        printArr(help);

        //write a method that takes two arrays as input and returns a single array consisting of all of the elements
        //from the two input arrays
        int[] comb = combineArrs(test, help);
        printArr(comb);

        //write a method that finds the average of all elements in an array and find the avg of the comb array
        double avg = getAvg(comb);
        System.out.println(avg);
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + ", ");
//        alternatively, you can use a for-each loop:
//        for(int val: arr)
//            System.out.print(val + ", ");
        System.out.println();
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i])
                min = arr[i];
        }
//        alternatively, you can use a for-each loop
//        for(int element: arr){
//            if(min>element)
//                min=element;
//        }
        return min;
    }

    public static int findMinPos(int[] arr){
        int minIdx = -1;
        int minVal = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(minVal>arr[i]){
                minVal = arr[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    public static int[] combineArrs(int[] a1, int[] a2){
        int[] outArr = new int[a1.length + a2.length];
        int j = 0;

        //notice how j won't reset after the loop ends, and is thus used as an index for the output array in both loops
        for(int i=0; i<a1.length; i++, j++){
            outArr[j] = a1[i];
        }

        for(int i=0; i<a2.length; i++, j++){
            outArr[j] = a2[i];
        }

        return outArr;
    }

    public static double getAvg(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
//        alternatively, you can use a for-each loop
//        for(int temp: arr){
//            sum += temp;
//        }
        int avg = sum / arr.length;
        return avg;
    }
}
