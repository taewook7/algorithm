import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int one[] = new int [41];
		int zero[] = new int [41];
		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;
		
		for (int i = 2; i <= 40; i++) {
			zero[i] = zero[i-1] + zero[i-2];
			one[i] = one[i-1] + one[i-2];
		}
		StringBuilder sb = new StringBuilder();
		int N= 0;
		for (int i = 0; i < n; i++) {
			N=Integer.parseInt(br.readLine());
			sb.append(zero[N]).append(" ").append(one[N]).append("\n");
		}
		System.out.println(sb.toString());


	}
}