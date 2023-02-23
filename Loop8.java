package corejava.loops;

public class Loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop8 lp = new Loop8();
		int num = 15;
		lp.perform(num);

	}

	 void perform(int num) {
		// TODO Auto-generated method stub
		 int i = 1,count = 0;
		 while(i<=num) {
			 if(num%i==0) {
				 System.out.print(i+" ");
				 count++;
			 }
			 i++;
		 }
		 System.out.println();
		 System.out.println("the total divisors are "+count);
		
	}

}
