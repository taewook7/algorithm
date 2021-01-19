import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int day=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		int count=0;
		
		if(day==a) count++;
		if(day==b) count++;
		if(day==c) count++;
		if(day==d) count++;
		if(day==e) count++;
		System.out.println(count);
	}
}