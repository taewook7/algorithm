import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int count =0;
		int t=Integer.parseInt(br.readLine());
		
		while (count < t) {
			StringTokenizer stz = new StringTokenizer(br.readLine());
			int h=Integer.parseInt(stz.nextToken());
			int w=Integer.parseInt(stz.nextToken());
			int n=Integer.parseInt(stz.nextToken());
			int f=0;
			
			if (n%h == 0 ) {
				f= h;
			} else {
				f=n%h;
			}
			int room=0;
			
			for (int i = 1; i <=w; i++) {
				if (i*h >= n) {
					room =i;
					break;
				}
			}
			
			if (room <10) {
				System.out.printf("%d0%d\n",f,room);
			} else {
				System.out.printf("%d%d\n",f,room);
			}
			count ++;
		}
	}
}
