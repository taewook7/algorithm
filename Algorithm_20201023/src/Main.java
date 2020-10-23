import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num=new int[42];
		int count=0;
		
		
		for (int i = 0; i < 10; i++) {
			int a=sc.nextInt();
			num[a % 42] ++;
			

		}
		
		
		for (int i = 0; i < 42; i++) {
			if (num[i]>0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
