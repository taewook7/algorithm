import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); // 고정비용
		int b= sc.nextInt(); // 가변비용
		int c= sc.nextInt(); // 노트북단가
		
		if ( c-b <= 0) {
			System.out.println(-1);
		} else {
			int sum = (a / (c-b))  +1;
			System.out.println(sum);
		}
	}
}
	
		
		
		
		
//		int count =0 ;
		
//		for (int i = 1; i <a; i++) {
//			int k= b*i;
//			int o= c*i;
////			int d = c-b; // 순이익 
//			if (a+k >= o) {
//				count++;
//			}
//			
//			if (a+k < o) {
//				count++;
//				break;
//			}
//			
//			if (c-b <= 0) {
//				count=-1;
//			}
//		}
//		System.out.println(count);
