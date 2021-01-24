import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = sc.next();
		String array[] = test.split("/");
		int result[] = new int[3];
		
		
		
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.valueOf(array[i]);
		}
		
		
		if( ((result[0] + result[2]) <  result[1] )  || result[1] == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
			
		
		
	}
}