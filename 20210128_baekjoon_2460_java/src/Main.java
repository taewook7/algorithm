import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =0;
		int result=0;
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			result = ((result+b)-a);
			
			
			if( result > max) {
				max= result;
			}
		}
		System.out.println(max);
	}
}