import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException   {
//		Scanner sc = new Scanner(System.in);
//		int n= sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int start = 0;
		int start2 = 1;
		
		if (n==1) {
			System.out.println(1);
		} else {
			for(int i=1; i<n; i++) {
				sum = start+start2;
				start=start2;
				start2=sum;
			}
			System.out.println(start2);
		}
	}
}

