import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main3 {

	public static void main(String[] args) throws Exception { 
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(r.readLine());
		
		for (int i = 1; i <= t; i++) {
			for (int j = 0; j <t-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}