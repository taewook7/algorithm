import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr=new int[3];
//		int x=sc.nextInt();
//		int y=sc.nextInt();
		int[] x=new int[3];
		int[] y=new int[3];
		
		
		for (int i = 0; i < x.length; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
			if (x[0] == x[1]) {
				System.out.print(x[2]);
			}
			if (x[1]==x[2]) {
				System.out.print(x[0]);
			}
			if (x[0]==x[2]) {
				System.out.print(x[1]);
			}
			System.out.print(" ");
			if (y[0]==y[1]) {
				System.out.print(y[2]); 
			}
			if (y[1]==y[2]) {
				System.out.print(y[0]);
			}
			if (y[0]==y[2]) {
				System.out.print(y[1]);
			}
	}
}
