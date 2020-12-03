import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int count=0;
		
		for (int i = 0; i < p; i++) {
			int h=sc.nextInt();
			if (h >= w && n >= h) {
				count++;
			}
		}
		System.out.println(count);
	}

}
