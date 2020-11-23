import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		int a = num1;
		int d = num1-num2;
		int n = 0;
		
		n = v-a;
		if(n%d != 0) {
			n = n/d+1;
		}else {
			n = n/d;
		}
		n++;
		
		bw.write(String.valueOf(n));
		bw.flush();
		bw.close();


	}
}
