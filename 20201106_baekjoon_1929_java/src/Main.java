import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean[] arr = new boolean[b+1];
		arr[0]=arr[1]=false;
		
		for (int i = 2; i <= b; i++) {
			arr[i]=true;
		}
		for (int j = a; j <=b ; j++) {
			for (int k = 2; k*k<=j; k++) {
				if(j%k==0) {
					arr[j]=false;
					break;
				}
			}
			if (arr[j]!=false) {
				System.out.println(j);
				
			}
		}
	}
}
