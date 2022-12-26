package Method;

public class work {

	public static void main(String[] args) {
		
		int result = getarea (500,100); 
		getvolume (result,30);
		
		
	}
	static int getarea (int l,int b) {
		int area = l*b;
		return area;
	}
	
	static void getvolume (int area,int height) {
		int volume =area*height;
		System.out.println("volume is "+volume);
	}
}
