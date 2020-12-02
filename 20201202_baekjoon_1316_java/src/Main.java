import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
    public static void main(String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	int T=sc.nextInt();
    	int count =T;
    	
    	for (int i = 0; i < T; i++) {
			String s=sc.next();
			int [] arr=new int[26];
			for (int j = 1; j < s.length(); j++) {
				if (s.charAt(j-1) != s.charAt(j)) {
					if (arr[s.charAt(j) - 97] ==1 ) {
						count--;
						break;
					}
					arr[s.charAt(j-1)-97 ] =1;
				}
			}
		}
    	System.out.println(count);
	}
	
}
