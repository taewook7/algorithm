import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s=sc.next();
		int N=sc.nextInt();
		char k[] = s.toCharArray();
		
		for (int i = 0; i <N; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			char tmp=k[a];
//			tmp2=k[b];
			k[a] = k[b];
			k[b] = tmp;
			
		}
		System.out.println(k);
	}
}
