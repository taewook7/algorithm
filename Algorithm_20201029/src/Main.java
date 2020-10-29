import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		String aski = sc.next();
		
		for (int i = 0; i < n; i++) {
			sum+= aski.charAt(i) -'0';
			
		}
			System.out.println(sum);
		
	}

}
