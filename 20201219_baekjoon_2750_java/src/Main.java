import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int result[] = new int[a];
		
		for (int i = 0; i < a; i++) {
			result[i] = sc.nextInt();
		}
		
		Arrays.sort(result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
