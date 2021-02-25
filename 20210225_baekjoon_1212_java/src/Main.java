import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String s = br.readLine();
    	String[] ss;
    	ss = s.split("");
    	StringBuffer sb = new StringBuffer();
    	for (int i = 0; i < s.length(); i++) {
			int num = Integer.parseInt(ss[i]);
			if(i != 0 && num <=1) {
				sb.append("00");
			} else if(i != 0 && (num==2 || num==3)) {
				sb.append("0");
			}
			sb.append(Integer.toBinaryString(num));
		}
    	System.out.println(sb);
    	
    }
}
