package Looping;

public class Oddeven {
	
	public static void main(String[] args) {
		int i;
		int es =0;
		int os =0;
		for ( i=1; i<=100;i++) {
			
			if(i%2==0) {
				es=es+i;
			
			}else {
				os =os+i;
			}
		}
		System.out.println("sum of even nos  = "+es);
		System.out.println("sum of odd nos  = "+os);
		System.out.println("=====================");
		System.out.println("total  = "+(es+ os));
		
		
	}

}
