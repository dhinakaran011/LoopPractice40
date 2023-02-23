package corejava.loops;

public class Loop9 {

	public static void main(String[] args) {
		Loop9 lp = new Loop9();
		int num = 4;
		lp.perform(num);
	}
	void perform(int num) {
		int divisor = 2,count = 0;
		while(divisor<num) {
			if(num%divisor==0) {
				count++;
				break;
			}
			divisor++;
			
		}
		if(count == 0) {
			System.out.println("this is prime");
		}else {
			System.out.println("this is not prime");
		}
	}

}
