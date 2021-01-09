import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) 
				System.out.print(" ");
			for (int j = i*2; j < (2*n)-1; j++) 
				System.out.print("*");
				System.out.println();
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n-1; j++) 
				System.out.print(" ");
			for (int j = 1; j < 4+count; j++) 
				System.out.print("*");
			System.out.println();
			count+=2;
		}
	}
}
