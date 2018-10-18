public class PracticeOct16 {
	
	static int a = 10;
	static int b = -10;
	
	public static void main(String[] args){
		//Predict the output:
		System.out.println(a);
		changeA(5);
		System.out.println(a);
		
		System.out.println(b);
		b += changeB(9);
		System.out.println(b);
		
	}
	
	public static void changeA(int val){
		a = val;
		for(int a=0; a<2; a++){
			System.out.println(a);
		}
	}
	
	public static int changeB(int val){
		int b = 0;
		b += val;
		System.out.println(b);
		return 1+b;
	}
	
	public static String seasonTemp(String season){
		String temp = "";
		switch(season.toLowerCase()){
			case "spring": 	temp = "mild";
					break;
			case "summer":	temp = "hot";
					break;
			case "fall":
			case "autumn":	temp = "meh.";
					break;
			case "december":temp = "cold";
					break;
		}
		return temp;
	}
	
	public static String getMonth(int monthNum){
		String monthName = "";
		if(monthNum==1)
			monthName = "Jan";
		else if(monthNum==2)
			monthName = "Feb";
		else if(monthNum==3)
			monthName = "Mar";
		else if(monthNum==4)
			monthName = "Apr";
		else if(monthNum==5)
			monthName = "May";
		else if(monthNum==6)
			monthName = "Jun";
		else if(monthNum==7)
			monthName = "Jul";
		else if(monthNum==8)
			monthName = "Aug";
		else if(monthNum==9)
			monthName = "Sept";
		else if(monthNum==10)
			monthName = "Oct";
		else if(monthNum==11)
			monthName = "Nov";
		else if(monthNum==12)
			monthName = "Dec";
		else
			monthName = "Not a month";
		return monthName;
	}
	
	public static String getMonthSwitch(int monthNum){
		String monthName = "";
		//rewrite the getMonth method using a switch statement
		switch(monthNum){
            case 1: monthName = "Jan";
                    break;
            case 2: monthName = "Feb";
                    break;
            case 3: monthName = "Mar";
                    break;
            //continue for 4-12
            default: monthName = "Invalid month."
        }
		return monthName;
	}
}
