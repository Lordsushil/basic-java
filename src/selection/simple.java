package selection;

import java.util.Scanner;

public class simple {
	public static void main(String[] args) {
		
		int p,t,r ;
		int si;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter principle");
		p =sc.nextInt();
		
		System.out.println("enter time");
		t =sc.nextInt();
		
		System.out.println("enter rate");
		r =sc.nextInt();
		
		if (p !=0 && t !=0 && r !=0 ) {
			
		
		si = p*t*r/100;
		System.out.println("simple interest is :"+si);
		
		}
		else {
			System.out.println("ERROR");
		sc.close();
		}
	
	}

}
