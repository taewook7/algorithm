import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		int count =0;
		
		for (int i = 0; i < a.length(); i++) {
			a.charAt(i);
			count++;
		}
		System.out.println(count);
		
	}
}