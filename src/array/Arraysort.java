
package array;

import java.lang.reflect.Array;
import java.util.Arrays;

import corejava.Data;

public class Arraysort {
	
	public static void main(String[] args) {
		
		int data [] = {9,8,9,64,12,1,1,31,84,01,13,1,64};
		
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		System.out.println("=================== reverse order====================");
		for(int i = data.length-1;i>=0;i--) {
			System.out.print(data[i]+" ");
		}
		
		Arrays.fill(data, 50);
		Arrays.fill(data,3,8,777);
		//Arrays.fill(data,3,4,000);
		System.out.println("\n"+Arrays.toString(data));
		
		int[] newArray = Arrays.copyOf(data, 5);
		System.out.println(Arrays.toString(newArray));
		System.out.println(Arrays.toString(Arrays.copyOfRange(data, 3, 3)));
	}

}
