import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		int a=w-x;
		int b=h-y;
		int min=1000;
		int[] arr= {x,y,a,b};		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min= arr[i];
			}
		}
		System.out.println(min);
		
	}

}
