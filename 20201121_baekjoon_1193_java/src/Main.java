import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int col=1;
		int count=1;
		while (count !=n ) {
			if ( (row+col) % 2 == 0) {
				if (row!=1) {
					row--;
					col++;
					count++;
				} else {
					col++;
					count++;
				}
			} else {
				if (col != 1) {
					col--; 
					row++;
					count++;
				} else {
					row++;
					count++;
				}
			}
		}
		System.out.println(row + "/" + col);
	}
}