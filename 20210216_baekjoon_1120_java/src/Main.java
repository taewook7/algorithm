import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in); 
		String st1 = sc.next();
		String st2 = sc.next();
		int min = st1.length();
		
		for(int i= 0; i<= st2.length()-st1.length(); i++) {
			int count = 0;
			for(int j =0; j<st1.length(); j++) {
				if(st1.charAt(j) != st2.charAt(i+j)) {
					count++;
				}
			}
			min = Math.min(min, count);
		}
		System.out.println(min);
	}
}
