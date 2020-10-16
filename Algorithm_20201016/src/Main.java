import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(rd.readLine());
		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(rd.readLine());
		for (int i = 0; i < N; i++) {
			int A=Integer.parseInt(st.nextToken());
			if (A<X) {
				wr.write(A+" ");
			}
		}
		wr.flush();
	}
}
