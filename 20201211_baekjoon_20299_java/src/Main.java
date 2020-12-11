import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String StartArrive[] = br.readLine().split(" ");

		int N=Integer.parseInt(StartArrive[0]);
		int K=Integer.parseInt(StartArrive[1]);
		int L=Integer.parseInt(StartArrive[2]);
		int a,b,c;
		int count=0;
		String result[] = new String[N];
		for (int i = 0; i < N; i++) {
			String StartArrive2[] = br.readLine().split(" ");
			a=Integer.parseInt(StartArrive2[0]);
			b=Integer.parseInt(StartArrive2[1]);
			c=Integer.parseInt(StartArrive2[2]);
			if ( (a >= L && b >= L && c >= L ) && (a+b+c >=K) ) {
				count++;
				result[i]=a+" "+b+" "+c+" ";
			}
		}
//		bw.write(count);
		System.out.println(count);
		for (int i = 0; i < result.length; i++) {
			if(result[i]==null) continue;
			bw.write(result[i]);
		}
		br.close();
		bw.close();
	}
}