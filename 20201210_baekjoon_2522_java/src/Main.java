import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		for (int i = 0; i < t ; i++) {
			for (int j = 0; j < t-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < t-1; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int k = t-i-1 ; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
