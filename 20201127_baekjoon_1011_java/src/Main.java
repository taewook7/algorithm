import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for (int i = 0; i < T; i++) {
			long x=sc.nextInt();
			long y=sc.nextInt();
			long diff=y-x;
			long count=0;
			long a=(long)Math.sqrt(diff);
			
			if(a==Math.sqrt(diff)) 
				count = 2*a-1;
			 else if(diff >= (a*a)+a+1 && diff<( (a+1)*(a+1)))
				count= 2*a+1;
			 else { 
				count= 2*a;
			 }
				System.out.println(count);
		}
	}
}
