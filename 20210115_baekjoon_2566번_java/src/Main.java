import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max[][] = new int[10][10];
		int max1=0;
		int max2=0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				max[i][j]=sc.nextInt();
				if(max[max1][max2]<max[i][j]) {
					max1=i; 
					max2=j;
				}
			}
		}
		System.out.println(max[max1][max2]);
		System.out.println(max1+1+" "+(max2+1));
	}
}