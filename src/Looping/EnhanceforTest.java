package Looping;

public class EnhanceforTest {
	
	/*
	 * 		syntax:
	 * 	
	 * 	for(data_type var: collection){
	 *     
	 *     //statement
	 *     
	 *     }
	 * 
	 */
public static void main(String[] args) {
	int sum = 0;
	int data[] = {9,8,76,54,356,22,78,90,9,87,65};
 	for (int x : data) {
 		System.out.println(x);
 		sum = sum + x;
 	}
 	System.out.println("sum is "+sum);
}
	
}

	

