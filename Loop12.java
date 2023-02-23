package corejava.loops;

public class Loop12 {

	public static void main(String[] args) {
		Loop12 lp = new Loop12();
		int num = 1234;
		lp.perform(num);
	}
	void perform(int num) {
		int sum = 0;
		while(num>0) {
			sum += num%10;
			num/=10;
		}
		System.out.println(sum);
	}

}
