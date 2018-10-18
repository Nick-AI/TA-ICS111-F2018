public class PracticeOct18 {

    public static void main(String[] args){
        //write a function that takes as an input the index of any month and returns the number of days
        //in that month
        int month = 8;
        int nbDays = dayLookup(month);
        System.out.println("Month " + month + " has " + nbDays + " days.");

        //nested for-loops
        octalCount(30);  //octal number system is a number system with only 8 digits (from 0-7), hence, 8 in octal is 10


        //creating a score board in EZ?


        //change dayLookupV2 (which now also takes the year into account) utilizing a switch statement
        month = 2;
        int year = 2000;
        nbDays = dayLookupV2(month, year);
        System.out.println("Month " + month + " in the year " + year + " has " + nbDays + " days.");
    }

    public static int dayLookup(int month) {
        int nbDays = 0;
        //returns 31 for months 1, 3, 5, ...
        //returns 30 for months 4, 6, 9, ...
        //returns 28 for month 2 (you can disregard leap years)
        //also handle the case if the number given is not actually a month
        return nbDays;
    }

    public static void octalCount(int upperLimit){
        //only counts up to 99 in octal (no 3-digit numbers)
        if(upperLimit>63) {
            System.out.println("TOO LARGE");
            return;
        }
        int dec_count = 0;
        for(int i=0; i<8; i++){
            for(int j=0; j<8 && dec_count<=upperLimit; j++){
                System.out.println(dec_count + " in octal: " + i + "" + j);
                dec_count++;
            }
        }
    }

    public static int dayLookupV2(int month, int year){
        int nbDays;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month ==12)
            nbDays = 31;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            nbDays = 30;
        else if(month == 2){
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
                nbDays = 29;
            else
                nbDays = 28;
        }
        else
            nbDays = -1;
        return nbDays;
    }
}
