import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bun = sc.nextInt();
		
		for (int i = 0; i < bun; i++) {
			int n=sc.nextInt();
			boolean a[] =new boolean[n];
			
			for (int j = 0; j < a.length; j++) {
				a[j]=true;
			}
			
			a[0]=a[1]=false;
			for (int j = 2; j*j < a.length; j++) {
				for (int j2 = j; j*j2 < a.length; j2++) {
					a[j*j2]=false;
				}
			}
			for (int j = n/2; j >=2; j--) {
				if (a[j] == true && a[n-j]==true) {
					System.out.println(j);
					System.out.println(n-j);
					break;
				}
			}
		}
			
			
	}

}



















