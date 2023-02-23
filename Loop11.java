package corejava.loops;

public class Loop11 {

	public static void main(String[] args) {
		Loop11 lp = new Loop11();
		int num = 1234;
		lp.perform(num);
	}
	void perform(int num) {
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println(count);
	}

}
