package selection;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		
		int length ;int breadth ;int height; int area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("length");
		length =sc.nextInt();
		
		System.out.println("breath");
		breadth =sc.nextInt();
		
		System.out.println("height");
		height =sc.nextInt();
		
		if (length != 0 && breadth != 0 && height !=0) {
		
			area = length * breadth * height;
		}
		else {
			System.out.println("enter valid value");
		}
		
		System.out.println("THE AREA IS : "+area);
		
	}
	

}
