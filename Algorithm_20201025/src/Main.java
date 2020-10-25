import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int score=0;
			int result=0;
			String a=sc.next();
			
			for (int j = 0; j < a.length(); j++) {
				
				if (a.charAt(j)=='O') {
					score++;
					result=result+score;
				} else {
					score=0;
				}
			}
			System.out.println(result);
		}
		
		
		
	}
}
