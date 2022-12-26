package selection;

public class Switch {
	
	/*
	 * ================= switch ==================
	 * 
	 *  	syntax:
	 *  
	 *  			switch(variable){
	 *  
	 *       case "jan" :
	 *       //statements
	 *       break;
	 *       
	 *       case 2:
	 *       //statement 
	 *       break;
	 *       
	 *       case 3:
	 *       //statement
	 *       break;
	 *       ...........
	 *       ..........
	 *       
	 *       	default:
	 *       //statements
	 * 
	 */
public static void main(String[] args) {
	
	int day =20;
	
	switch(day) {
	
	case 1:
		System.out.println("sunday");
		break;
		
	case 2:
		System.out.println("monday");
		break;
		
	case 3:
		System.out.println("tuesday");
		break;
	case 4:
		System.out.println("wednesday");
		break;
	case 5:
		System.out.println("thursday");
		break;
	case 6:
		System.out.println("friday");
		break;
	case 7:
		System.out.println("saturday");
		break;
default	:
	System.out.println("invalid input");
	}
	/*
	 *  q. WAP to calculate total salary for following post :
	 *  
	 *  post(switch)       basic salary  bonus     total salary
	 *  
	 *  MD                     400000        29.89%         ?
	 *  CEO                    538000           15%         ?
	 *  MANAGER                280000         5.78%         ?
	 *  HELPER                 120000          7.98%        ?
	 */
}
}
