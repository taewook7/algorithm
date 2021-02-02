import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		Scanner  sc = new Scanner (System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int min=a*b;
		
		if(a<b) {
			int temp=a;
			a=b;
			b=temp;
		}
		int max =b;
		if(min != 0) {
			while(true) {
				if(a%b == 0 || b ==1) {
					break;
				}
				int k=a%b;
				a=b;
				b=k;
			}
			max=b;
			min=min/max;
		}
		System.out.println(max);
		System.out.println(min);
	}
}