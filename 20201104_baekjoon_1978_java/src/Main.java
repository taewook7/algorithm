import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		for (int i = 0; i < number; i++) {
			int a= sc.nextInt();
			int tmp = 0;
			
			for (int j = 1; j < a; j++) {
				
				if (a%j==0) {
					tmp++;
				}
			}
				if (tmp==1) {
					count++;
				}
		}
		System.out.println(count);
	}

}
