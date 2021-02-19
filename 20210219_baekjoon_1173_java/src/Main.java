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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		int min = m;
		int ans = 0;
		int total = 0;
		if(M-m<T) {
			bw.write(String.valueOf(-1));
			bw.flush();
			System.exit(0);
		}
		while(true) {
			
			if(ans == N) {
				break;
			}
			//total++;
			if(m+T<=M) { 
				ans++;
				m+=T;
				total+=1;
			}else if(m+T>T) { 
				total+=1;
				m-=R;
				if(m<min)m=min; 
			}
			
			
		}
		
		bw.write(String.valueOf(total));
		bw.flush();
		
		
		
	}
}
