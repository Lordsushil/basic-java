package selection;

public class NestedifTest {
	/*
	 * syntax:
	 * 
	 * 		if(condition-1){
	 * 
	 * 
	 * 			if(condition-2){
	 *           ..................
	 *           ..................
	 *           
	 *           } else{
	 * 
	 * 
	 *        }
	 */

	public static void main(String[] args) {
		
		String citizen = "nepali";
		int age = 10;
		boolean voterId =true;
		
		
		
		if(citizen.equals("nepali")) {
			
			if(age >= 18) {
				
				
				if(voterId) {
					System.out.println("you can vote");
					
					
				}else {
					System.out.println("you don't have voter id");
				
				}
				
			}else {
				
				System.out.println( "you are under age");
			}
			
			
		}else {
			
			System.out.println("invalid citizenship");
		}
	 
	}
	
}
