package 윤년2753번문제;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		
		if (year <=4000 && year>=1) {
			if ( (year%4==0 && year%100 !=0) || year%400==0) {
				System.out.println("1");
			} else{
				System.out.println("0");
				
			}
		} else {
			System.out.println("범위를 초과하셨습니다.");
		}
		sc.close();
	}
}
