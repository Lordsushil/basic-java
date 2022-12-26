package Looping;

public class WhileTest {
	/*
	 * syntax:
	 * 
	 * 		while(condition){
	 * 
	 * 			//statements
	 *     //inc/dec
	 *     
	 *     }
	 *     
	 * 5!= 5*4*3*2*1 =120;
	 */
public static void main(String[] args) {
	
	
	int n =5 ;
	int fact =1 ;
	
	while(n>1) {
		
		
		fact = fact *n;
		n --;
	}
	System.out.println("factorial ="+fact);
	
}
}
