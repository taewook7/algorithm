import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int a=25;
		int b=10;
		int c=5;
		int d=1;
				
		
		for (int i = 0; i < t; i++) {
			int money = sc.nextInt();
			int temp1 = money/a;
			int temp2 = (money%a)/b;
			int temp3 = ((money%a)%b)/c;
			int temp4 = (((money%a)%b)%c)/d;
			
			System.out.println(temp1+" "+temp2+" "+temp3+" "+temp4);
		}
		
	}
}