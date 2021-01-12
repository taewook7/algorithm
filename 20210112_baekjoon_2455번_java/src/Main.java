import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= 4;
		
			int a1=sc.nextInt();
			int b1=sc.nextInt();
			int a2=sc.nextInt();
			int b2=sc.nextInt();
			int a3=sc.nextInt();
			int b3=sc.nextInt();
			int a4=sc.nextInt();
			int b4=sc.nextInt();
			
			int c1 = a1+b1;
			
			int c2 = c1-a2+b2;
			int c3 = c2-a3+b3;
			int c4 = c3-a4+b4;
			
			int k1=Math.max(c1, c2);
			int k2=Math.max(c3, c4);
			int k3=Math.max(k1, k2);
			
			
			System.out.println(k3);
			
	}
}
