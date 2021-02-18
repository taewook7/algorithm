import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)    {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp[] = new int[127];
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			temp[a.charAt(0)]++;
		}
		String temp2="";
		for (int i = 'a'; i <= 'z'; i++) {
			if(temp[i] >=5) {
				temp2+=(char)i;
			}
		}
		System.out.println(temp2.length()>0 ?temp2:"PREDAJA");
	}
	
}

