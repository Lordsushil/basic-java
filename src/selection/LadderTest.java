package selection;

public class LadderTest {

	/*
	 * ========================else-if ===============================
	 * 
	 * 			syntax:
	 * 
	 * 		if(condition-1){
	 *    
	 *    }
	 *    else if (condition-1){
	 *    
	 *    }
	 * 
	 * else if (condition-1){
	 *    
	 *    }
	 * 	else if (condition-2){
	 *    
	 *    }
	 *    else 
	 * 	
	 * 
	 *  	
	 */
	public static void main(String[] args) {
		
		
		int marks = 56;
		if (marks >= 80) {
			System.out.println("sistinction");
			
		}
		else if (marks >= 60) {
			System.out.println("first");
			
		}
		else if (marks >= 45) {
			System.out.println("second");
		
	}
		else if (marks >= 32) {
			System.out.println("third");
		}
		else  {
			System.out.println("fail");
		}
}
	}
	
	