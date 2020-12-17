import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		
		int k =0;
		if(b>B) {
			k= b/B;
		} else {
			k= B/b;
		}
		System.out.println(Math.abs(c-A)+" "+k+" "+Math.abs(a-C));
	}
}