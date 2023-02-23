package corejava.loops;

public class Loop14 {

	public static void main(String[] args) {
		Loop14 lp = new Loop14();
		int num = 121;
		lp.perform(num);
	}
	void perform(int num) {
		int rev = 0,poly = num;
		while(num>0) {
			rev = rev*10 + num%10;
			num /= 10;
		}
		if(poly == rev) {
			System.out.println("this is polyndrome");
		}else {
			System.out.println("this is not polyndrome");
		}
	}

}
