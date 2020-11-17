import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int han=0;
		
		for (int i = 0; i <= n; i++) {
			if (i>=1 && i<100) {
				han++;
			}
		}
		
		if (n>=100 && n<=1000) {
			for(int k=100; k<=n; k++) {
				int first = k/100; //첫번째자리수
				int second = (k%100)/10; //두번째자리수
				int third = (k%100)%10; //세번째자리수
				if(third-second == second-first) {
					han += 1;
				}
				else {
					han += 0;
				}
			}
		}
		System.out.println(han);
	}
}
