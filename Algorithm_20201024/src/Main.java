import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int max=0;
		int sum=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int k=sc.nextInt();
			sum=(sum+k);
			if (k>max) {
				max=k;
			}
		}
		
		avg= (double)sum*100/max/n;
		System.out.println(avg);
		
	}

}
