package selection;

import java.util.Scanner;

public class IfTest {
	
	/*
	 * 	syntax :
	 * 
	 * 	if(condition){
	 *
	 *  	//statement	 
	 * }
	 * 
	 */
	public static void main(String[] args) {
		
		int salary ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your salary ?");
		salary = sc.nextInt();
		
		
		
		if(salary < 30000) {
			
			salary = salary + 8000;
		}
		System.out.println("total salary="+salary);
		
		
		
		
	}
	
	
	
	
}
