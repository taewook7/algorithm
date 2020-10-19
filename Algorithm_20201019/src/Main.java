import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N=sc.nextInt();
		int A=N/10;
		int B=N%10;
		int temp;
		int count=0;
		
		while (N>=0 && N<=99) {
			count++;
			int C=(A+B);
			A=B;
			B=(C%10);
			
			if (N == ((A*10)+B)) {
				System.out.println(count);
				break;
			}
		}
	}

}

