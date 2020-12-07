import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;
		int[] arr=new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i]=sc.nextInt();
			result+=arr[i];
		}
		System.out.println(result);
	}

}
