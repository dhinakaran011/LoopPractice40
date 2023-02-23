package corejava.loops;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 lp = new Loop1();
		int num = 5;
				lp.perform(num);

	}

	 void perform(int num) {
		// TODO Auto-generated method stub
		while(num>0) {
			System.out.print("1 ");
			num -= 1;
		}
	}

}
