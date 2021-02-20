import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String st;
		
		while (true) {
			st =br.readLine();
			if(st.equals("#")) {
				break;
			} else {
				int len = st.length();
				int sum = 0;
				for(; len>0; len--) {
					int num =0;
					switch(st.charAt(st.length() - len)) {
					case '-':
						num = 0;
						break;
					case '\\':
						num = 1;
						break;
					case '(':
						num = 2;
						break;
					case '@':
						num = 3;
						break;
					case '?':
						num = 4;
						break;
					case '>':
						num = 5;
						break;
					case '&':
						num = 6;
						break;
					case '%':
						num = 7;
						break;
					case '/':
						num = -1;
						break;
					}
					sum += (num * Math.pow(8, len-1));
				}
				sb.append(sum).append('\n');
			}
		}
		System.out.println(sb);
	}
}
