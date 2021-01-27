import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int f = sc.nextInt();
		
		int result =0;
		
		int a = n%100;
		n-=a;
		
		while(true) {
			if((float) (n%f) ==0) {
				break;
			}
			
			n++;
			result++;
		}
		
		if(result <10) {
			String st="0"+String.valueOf(result);
			System.out.println(st);
		} else {
			System.out.println(result);
		}
		sc.close();
	}
}