import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int five=0;
		int three=0;
		int count=0;
		
		while(true) {
			if (n%5==0) {
				five=n/5;
				break;
			} else if ( n<3) {
				three = -1;
				break;
			}
			n= n-3;
			three++;
		}
		System.out.println(five+three);
	}
}