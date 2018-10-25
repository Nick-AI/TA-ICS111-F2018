import java.util.Arrays;

public class PracticeOct25 {

	public static void main(String[] args){
		Test t = new Test();
		t.changeOne(10, 9, 8);
		t.changeTwo();
		int something = doAction(1024, 5);
		System.out.println(something);
		System.out.println("Done.");
	}
	
	public static int doAction(int a, int b){
		int[] stuff = new int[b];
		int num = 2;
		for(int i=b-1; i>=0; i--){
			stuff[i] = a/num;
			num *= 2;
		}
		return sum(stuff);
	}
	
	public static int sum(int[] things){
		int sum=0;
		for(int n:things)
			sum+=n;
		return sum;
	}
	
	public static class Test{
		int a, b, c;
		String d = "-1";
		
		public void changeOne(int a, int b, int c){
			this.a = c;
			this.b = a+b;
			this.c = this.a + c;
			allOut();
			System.out.println(a + b + c);
		}
		
		public int doSomething(int a, int b){
			return this.a-a + this.b-b;
		}
		
		public void changeTwo(){
			for(int i=0; i<2; i++){
				d += this.doSomething(1, 2);
			}
			this.allOut();
		}
		
		public void allOut(){
			System.out.println(a + " " + b + " " + c + d);
		}
	}
}
