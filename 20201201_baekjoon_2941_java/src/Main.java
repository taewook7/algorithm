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

    	String [] croatia= {"c=","c-","dz=","d-","lj","nj","s=","z="};
    	
    	for (int i = 0; i < croatia.length; i++) {
			if (s.contains(croatia[i])) {
				s=s.replaceAll(croatia[i], " ");
			}
    		
		}
    	System.out.println(s.length());
    	
	}
	
}
