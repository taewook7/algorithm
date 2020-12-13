import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i>1 && i%2==0) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}