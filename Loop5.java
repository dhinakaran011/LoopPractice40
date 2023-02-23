package corejava.loops;

public class Loop5 {
	public static void main(String[] args) {
		Loop5 lp = new Loop5();
		int num = 100;
		lp.perform(num);
	}

	 void perform(int num) {
		// TODO Auto-generated method stub
		 int i=1;
		 while(i<=num) {
			 if(i%3==0 && i%5==0) {
				 System.out.print(i+" ");
			 }
			 i++;
		 }
		
	}

}
