package corejava.loops;

public class Loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop7 lp = new Loop7();
		int num = 15;
		lp.perform(num);

	}

	 void perform(int num) {
		// TODO Auto-generated method stub
		 int i = 1;
		 while(i<=num) {
			 if(num%i==0) {
				 System.out.print(i+" ");
			 }
			 i++;
		 }
		
	}

}
