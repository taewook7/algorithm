import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minute=0;
		int second=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int k= a+b+c+d;
		minute=k/60;
		second=k%60;
		
		System.out.println(minute);
		System.out.println(second);
	}
}
