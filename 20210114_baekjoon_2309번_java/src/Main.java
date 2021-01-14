import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[9];
		int sum=0;
		int a =0;
		int b =0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			sum += n[i];
		}
		Arrays.sort(n);
		
		//브루트 포스 
		for (int j = 0; j < n.length; j++) {
			for (int k = j+1; k < n.length; k++) {
				if(sum-n[j] - n[k] ==100) {
					a=j;
					b=k;
					break;
				}
			}
		}
		for (int t = 0; t < n.length; t++) {
			if(t == a || t == b) 
				continue;
				System.out.println(n[t]);
			
		}
	}
}
