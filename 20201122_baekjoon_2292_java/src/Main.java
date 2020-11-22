import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int room=sc.nextInt();

		int a=1;
		int count=1;

		while (true) {

			if (room <= a) {
				break;
			}
				a=a+(6*count);
				count++;
		}
		System.out.println(count);
	}
}
