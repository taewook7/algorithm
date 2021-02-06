import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <= n ; i++) {
			for (int j = i; j <= n-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i*2-1; j++) {
				if(j%2==1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}