import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		int sum=0;
		String st=sc.next();
		if (t==st.length()) {
			for (int i = 0; i < t; i++) {
				if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
					sum+= (int) (st.charAt(i)-64);
				}
			}
		}
		System.out.println(sum);
	}
}
