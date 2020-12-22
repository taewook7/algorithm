import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int g=sc.nextInt();
		int h=sc.nextInt();
		
		int minguk= a+b+c+d;
		int manse= e+f+g+h;
		
		if (minguk >= manse) {
			System.out.println(minguk);
		} else if (manse >minguk) {
			System.out.println(manse);
		}
	}
}
