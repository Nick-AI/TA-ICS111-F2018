import java.util.Arrays;

public class PracticeOct23 {

    static int a = 0;
    static int b = 10;
    static final int c = 7;

    public static void main(String[] args){

        int[] test = new int[7];
        final int[] PRIMES = {1, 2, 3, 5, 7, 11, 13};
        for(int i=test.length-1; i>=0; i--){
            test[i] = PRIMES[PRIMES.length-1-i] * PRIMES[i];
            test[i] -= 1;
        }
        System.out.println(Arrays.toString(test));

        for(int a=0; a<5; a++){
            PracticeOct23.a += 2;
            b ++;
            System.out.println(a);
        }
        int c = PracticeOct23.c;
        c -= 3*2;
        System.out.println(a + " " + b + " " + c);
        System.out.println(PracticeOct23.a + " " + PracticeOct23.b + " " + PracticeOct23.c);

        //write two methods to read the files pract1.txt and pract2.txt respectively.
        //use approporiate datatypes

        //create a Date class
        //it should contain 1 variable for day, month, and year respectively (type is up to you)
        //it should have a constructor that lets you initialize all of those variables
        //it should have 2 methods:
        //-printShort(), should print the date just using numbers
        //-printLong(), you can see where this is going, print out the full name of the month

        //use your date class, create you birthday and print it out in both formats

        //Take the CardShuffle Project from class and rewrite the Card.java class' print() method to use switch
    }

}
