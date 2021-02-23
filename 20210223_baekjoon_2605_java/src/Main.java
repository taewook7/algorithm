import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException  {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	int[] arr = new int[n+1];
    	
    	StringTokenizer stz = new StringTokenizer(br.readLine(), " ");
    	
    	for (int i = 1; i <= n; i++) {
			int diff = Integer.parseInt(stz.nextToken());
			
			if(diff ==0) {
				arr[i] = i;
			} else {
				for (int j = i; j >= i-diff; j--) {
					arr[j] = arr[j-1];
				}
				arr[i-diff] = i;
			}
		}
    	for (int i = 1; i <= n; i++) {
			System.out.print(arr[i]+" ");
		}
    	
    }
}
