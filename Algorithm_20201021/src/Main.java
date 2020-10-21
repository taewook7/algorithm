import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max=0;
		
		int[] arr = new int[9];
			
			for (int i = 0; i < 9; i++) {
				arr[i]=sc.nextInt();
				if (arr[max] < arr[i]) 
					max=i;
				
			}
			System.out.println(arr[max]);
			System.out.println( (max+1) );
	}
}
