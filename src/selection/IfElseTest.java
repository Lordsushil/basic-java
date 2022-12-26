package selection;

import java.util.Scanner;

public class IfElseTest {
	
	public static void main(String[] args) {
		
		/*
		 * ================= if-else==========================
		 * 
		 *  syntax:
		 *  
		 *  	if(condition){
		 *  
		 *  //statements
		 *  
		 *  }	else{
		 * 
		 *   //statements
		 *   
		 *   }
		 */
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		if(n % 2==0) {
			System.out.println(" is even number"+n);
		}  else {
			System.out.println(" is odd number"+n);
			
		}
	}

}      
