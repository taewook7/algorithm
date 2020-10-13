
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int T=Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			String r = in.readLine();
			StringTokenizer st = new StringTokenizer(r);
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			out.write(a+b+"\n");
		}
		
		out.flush();
		out.close();
	}
}
