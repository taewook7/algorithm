import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int a2=Math.min(a, b);
		int a3=Math.min(a2, c);
		int a4=Math.min(d, e);
		
		
		System.out.println(a3+a4-50);
	}
}
