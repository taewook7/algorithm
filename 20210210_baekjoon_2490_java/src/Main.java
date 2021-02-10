import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 4; j++) {
				list.add(sc.nextInt());
				int sum = list.stream().reduce(0, Integer::sum);
				if(sum ==4) {
					System.out.println("E");
				}
				if(sum ==3) {
					System.out.println("A");
				}
				if(sum ==2) {
					System.out.println("B");
				}
				if(sum ==1) {
					System.out.println("C");
				}
				if(sum ==0) {
					System.out.println("D");
				}
				
			}
			
		}
	}
}