import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num,count=0;
	
		while(true) {
			num=in.nextInt();
			if (num==0) break;
			int n=num*2;
			count=0;
			boolean[] arr= new boolean[n+1];
			arr[0]=arr[1]=false;
			for(int i=2;i<=n;i++) arr[i]=true;
			for(int i=2;i<=n;i++) {
				for(int j=2;j*i<=n;j++) 
					arr[i*j]=false;
			}
			for(int i=num+1;i<arr.length;i++) 
				if (arr[i]) count++;
			System.out.println(count);
		}
	}
}


