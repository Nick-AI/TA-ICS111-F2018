import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PracticeDec04 {

    public static void main(String[] args) {
        Double[] vals = {1., 0., 0., 1., 1., 1., 0., 0., 0., 0., 1., 0.};
        System.out.println(shennanigans(vals));
        forLoopThings();
    }

    public static ArrayList shennanigans(Double[] doubList){
        ArrayList<Double> someList = new ArrayList(Arrays.asList(doubList));

        someList.remove(1.);
        someList.add(2.);
        someList.remove(someList.lastIndexOf(0.)-2);
        someList.add(someList.size()/2, (double)(someList.size()));
        for(Double val: someList) {
            someList.set(someList.indexOf(val), val + val);
        }
        someList.remove(0);
        someList.remove(0.);
        return someList;
    }

    //write a for-loop to create the following 2D array:
    //[1, 0, 0, 0, 1] 
    //[0, 1, 0, 1, 0] 
    //[0, 0, 2, 0, 0] 
    //[0, 1, 0, 1, 0] 
    //[1, 0, 0, 0, 1] 
    public static void forLoopThings(){
    
    }

    //write a class called quiz, it should have a constructor that takes in a score
    //it should have a method called whatScore that prints "Your score is" and the score
    //Inherit from this class in a class called FinalQuiz
    //override the whatScore method to always print out "You're score is 100"
}
