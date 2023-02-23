package corejava.loops;

public class Loop10 {

	public static void main(String[] args) {
		Loop10 lp = new Loop10();
		int num = 1234;
		lp.perform(num);
	}

	 void perform(int num) {
		 while(num>0) {
			 System.out.print(num%10);
			 num /= 10;
		 }
	}

}
