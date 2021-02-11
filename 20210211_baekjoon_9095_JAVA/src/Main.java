import java.util.Scanner;

public class Main {

	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] temp = new int[n];
		int[] temp2 = new int[11];
		temp2[1] = 1;
		temp2[2] = 2;
		temp2[3] = 4;
		for (int i = 0; i < n; i++) {
			temp[i] = sc.nextInt();
		}
		for (int i = 4; i < temp2.length; i++) {
			temp2[i] = temp2[i-1] + temp2[i-2] + temp2[i-3];
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(temp2[temp[i]]);
		}
		sc.close();
	}
}