package Looping;

public class DowhileTest {
	
	
	/*
	 * Syntax:
	 * 
	 * do{
	 * 
	 *    //statements
	 *    //inc/dec
	 * 
	 * 
	 * }while(condition);
	 * 
	 * 9 x 1 = 9
	 * 9 x 2 = 18
	 * .............
	 * ............
	 * 9 x 10 = 90
	 */

	
	public static void main(String[] args) {
		
		int n= 9;
		int i =1;
		
		do {
			
			
			System.out.println(n +" X "+i+" = "+ (n*i));
			i++;
		}while(i <= 10);
		}
	}
