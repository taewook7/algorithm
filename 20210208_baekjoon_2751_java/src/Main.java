import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n=Integer.parseInt(br.readLine());
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			temp.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(temp);
		for(int i : temp) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
		
		
	}
}