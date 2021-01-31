import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		int[] num = new int[8];
		int input = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < 7; i++) {
			num[i] = input%2;
			input/=2;
		}
		for (int i = 0; i < 7; i++) {
			if(num[i]==1) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}