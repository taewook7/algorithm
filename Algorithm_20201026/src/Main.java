import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avg;
		
		int n=sc.nextInt();
		for (int i = 0; i <n; i++) {
			int n2=sc.nextInt();
			int[] w=new int[n2];
			int sum=0;
			
			for (int j = 0; j < n2; j++) {
				w[j]=sc.nextInt();
				sum=sum+w[j];
			}
			avg=(double)sum/n2;
			int count=0;
				for (int j = 0; j < n2; j++) {
					if (w[j]>avg) {
						count++;
					}
				}
				double result=(double) count/n2*100;
				System.out.printf(String.format("%.3f", result));
				System.out.println("%");
			}
		}
	}