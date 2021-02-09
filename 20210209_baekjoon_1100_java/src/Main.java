import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		char chess[][] = new char[8][8];
		int n =0;
		
		for (int i = 0; i < 8; i++) {
			String st = sc.nextLine();
			for (int j = 0; j < 8; j++) {
				chess[i][j] = st.charAt(j);
				
				if (chess[i][j] == 'F' && (i+j) % 2 == 0) {
					n++;
				}
			}
		}
		System.out.println(n);
		
	}
}