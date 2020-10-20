import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int list[]=new int[n];

		for (int i = 0; i < n; i++) {
			list[i]=sc.nextInt();
		}
		
		int max =0, min=0;
		for (int i = 1; i < list.length; i++) {
			if (list[i] < list[min] ) {
				min=i;
			} else if(list[i]>list[max]) {
				max=i;
			}
		}
		System.out.println(list[min]+" " +list[max]);
	}
}
