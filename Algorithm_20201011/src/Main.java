import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int H;
		int M;
		int rem;
		Scanner sc = new Scanner(System.in);
		while (true) {
			H = sc.nextInt();
			M = sc.nextInt();
			if (H >= 0 && H < 24 && M >= 0 && M < 60) {
				rem = M - 45;
				if (rem<0) {
					rem=rem+60;
					H--;
				}
				if (H<0) {
					H=23;
				} 
				System.out.println(H + " " + rem);
				break;
			} else {
				System.out.println("다시 입력하시오.");
			} 
		}
		sc.close();
	}
}