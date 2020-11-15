import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result=0;
		int k=1;
		
		for (int i = 1; i <=n; i++) {
			k *= i;
			
		}

		System.out.println(k);
	}
}







