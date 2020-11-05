import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int tmp=0;
		int min=b;
		int sum=0;
		for (int T = a; T<= b; T++) {
			tmp=0;
			for (int i = 1; i <= T; i++) {
				if (T%i==0) 
					tmp++;
				}
				if (tmp==2) {
					sum=sum+T;
					if (min>T) 
						min=T;
				}
			}
		
	
		if (sum==0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
