import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for (int i = 0; i<T; i++) {
			int k=sc.nextInt();
			int n=sc.nextInt();
			System.out.println(result(k,n));
		}
		
		}
	
	private static int result(int k,int n) {
		if(k==0) {
			return n;
		} else {
			int r=0;
			for (int i = 1; i <= n; i++) {
				r= r+result(k-1,i);
			}
			return r;
		}
		
		
	}
	}
