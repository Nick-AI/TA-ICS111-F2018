import java.awt.Color;

public class PracticeSpt18 {

	public static void main(String[] args){
		//write a while loop that prints all numbers from 1 to 100. If the number has only one digit, also print "low" on the same line as the number, otherwise print "high"
		int count = 1;
		while(count<=100){
			if(count<10)
				System.out.println(count + " low");
			else
				System.out.println(count + " high");
			count++;
		}
		printStudent("Bob", 18);
		clickCar();
	}
	
	//complete the function header so it takes in the name of the student and his/ her age. 
	public static void printStudent(String name, int age){
		boolean isAdult;
		//write an if statement to determine whether isAdult is true (student is at least 18) or false (student is under 18)
		isAdult = (age>17);
		//print out the name of the student and whether he/ she is an adult or not based on the value of isAdult
		if(isAdult)
			System.out.println(name + " is an adult.");
		else
			System.out.println(name + " is not an adult.");
	}
	
	//write a function to create an EZ window with a car that always drives toward where you click with the mouse, if it reaches an edge it stop until you click again. 
	public static void clickCar(){
		int width = 960, height = 540;
		EZ.initialize(width, height);
		EZ.setBackgroundColor(new Color(84, 84, 84));
		EZImage car = EZ.addImage("car.png", width/2, height/2);
		car.scaleTo(0.05);
		int clickX, clickY, speed=20;
		double xdir=0, ydir=0;
		while (true) {
			if(EZInteraction.wasMouseLeftButtonReleased()){
				clickX = EZInteraction.getXMouse();
				clickY = EZInteraction.getYMouse();
				xdir = getXDir(car, clickX, clickY);
				ydir = getYDir(car, clickX, clickY);
			}
			car.translateTo(car.getXCenter()+speed*xdir, car.getYCenter()+speed*ydir);
			if(isOutsideBounds(car, width, height)){
				xdir = 0;
				ydir = 0;
			}
			EZ.refreshScreen();
		}
	}
	
	public static double getXDir(EZImage img, int clickX, int clickY){
		int w = clickX-img.getXCenter();
		int h = clickY-img.getYCenter();
		double d = Math.sqrt(w*w + h*h);
		return w/d;
	}
	
	public static double getYDir(EZImage img, int clickX, int clickY){
		int w = clickX-img.getXCenter();
		int h = clickY-img.getYCenter();
		double d = Math.sqrt(w*w + h*h);
		return h/d;
	}
	
	public static boolean isOutsideBounds(EZImage img, int width, int height){
		return (img.getXCenter()>width || img.getXCenter()<0 || img.getYCenter()>height || img.getYCenter()<0);
	}
	
}
