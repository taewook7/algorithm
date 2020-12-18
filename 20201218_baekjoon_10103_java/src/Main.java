import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int A=100;
		int B=100;
		int T=sc.nextInt();
		for (int i = 0; i < T; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if (a>b) {
				B-=a;
			} else if ( b>a) {
				A-=b;
			}
		}
		System.out.println(A);
		System.out.println(B);
	}
}