import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			int n2=sc.nextInt();
			String s=sc.next();
			
			
			for (int j = 0; j < s.length(); j++) {
			char ch=s.charAt(j) ;
			
				for (int k = 0; k < n2; k++) {
					System.out.print(ch);
				}
			}
			System.out.println();
		}
	}
}
	
