import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main{
    public static void main(String args[]) throws IOException {
    	Scanner sc = new Scanner(System.in);
    	String s=sc.next();

    	
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();


    	int sum=0;
    	for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) <='C') {
				sum+=3;
			}
			else if(s.charAt(i) <= 'F') {
				sum += 4;
			}
			else if(s.charAt(i) <= 'I') {
				sum += 5;
			}
			else if(s.charAt(i) <= 'L') {
				sum += 6;
			}
			else if(s.charAt(i) <= 'O') {
				sum += 7;
			}
			else if(s.charAt(i) <= 'S') {
				sum += 8;
			}
			else if(s.charAt(i) <= 'V') {
				sum += 9;
			}
			else if(s.charAt(i) <= 'Z') {
				sum += 10;
			}
		}
		System.out.print(sum);


		}
    	
    }
