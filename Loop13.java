package corejava.loops;

public class Loop13 {

	public static void main(String[] args) {
		Loop13 lp = new Loop13();
		int num = 12346;
		lp.perform(num);
	}
	void perform(int num) {
		int rev = 0;
		while(num>0) {
			rev = rev*10 + num%10;
			num /= 10;
		}
		System.out.println(rev);
	}

}
