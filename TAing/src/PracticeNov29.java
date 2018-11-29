import java.util.ArrayList;
import java.util.Arrays;

public class PracticeNov29 {

    public static void main(String[] args) {
        ArrayList<int[]> testList = new ArrayList<>();
        testList.add(new int[]{1, 2, 3});
        testList.add(new int[]{4, 5});
        testList.add(new int[]{6, 7, 8, 9});
        testList.add(new int[]{0});

        for(int[] item: testList)
            System.out.println(Arrays.toString(item));
        testList = funWithArrays(testList);
        for(int[] item: testList)
            System.out.println(Arrays.toString(item));

    }

    public static ArrayList<int[]> funWithArrays(ArrayList<int[]> in){
        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<int[]> b = new ArrayList<>();
        for(int[] sub: in){
            int[] newList = new int[sub.length];
            for(int i = 0; i<sub.length; i++){
                newList[sub.length-i-1] = sub[i];
            }
            a.add(sub);
            b.add(newList);
        }
        in.removeAll(a);
        for(int i=b.size()-1; i>-1; i--)
            in.add(b.get(i));
        return in;
    }

    //write a class called myIntArrayList
    //the class should have one instance variable, being an integer array
    //the class should have one constructor that takes in the size of the array list instance and the initializes the
    //integer array to that size
    //it should have an .append() method that inserts an int at the next open slot
    //it should have a .get() method that retrieves the item at a given slot
    //lastly, it should have a .reverse() method that reverses the order of the items in the array
}
