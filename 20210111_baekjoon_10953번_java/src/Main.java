import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String str[] = sc.next().split(",");
			System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
		}
	}
}
