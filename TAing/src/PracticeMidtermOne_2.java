import java.io.BufferedInputStream;
import java.util.Scanner;

public class PracticeMidtermOne_2 {

    public static void main(String[] args){
        String name;
        Scanner s = new Scanner(new BufferedInputStream(System.in));
        System.out.println("Please enter your name");
        name = s.nextLine();
        methodC(name);
        s.close();

        int fibonacciLimit = 10000;
        int closestFib = fibonacci(fibonacciLimit);
        System.out.println(closestFib);
    }

    public static int methodA(String s){
        if(s.length() < 6){
            return s.length();
        }
        else if(s.length() < 12){
            return s.length()/2;
        }
        else{
            return -1;
        }
    }

    public static double methodB(int i){
        double out = 1000;
        if(i > 0){
            int count = 0;
            while(count<i){
                out *= 0.5;
                count++;
            }
        }
        else{
            while((2*out)<10){
                out -= 100;
            }
        }
        return out;
    }

    public static void methodC(String name){
        int a;
        a = methodA(name);
        System.out.println(methodB(a));
    }

    public static int fibonacci(int upperLimit){
        //Complete the function to find the closest fibonacci number below upperLimit
        //The fibonacci sequence is the sequence of numbers where the number at position i is calculated by the simple
        //formula f(i)=f(i-1)+f(i-2)
        //The sequence starts with 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
    }
}
