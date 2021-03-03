import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception, IOException {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for (int i = 0; i < n; i++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int dp[][] = new int[N+1][M+1];
			for(int j=2; j<=N; j++) {
				dp[j][1] =0;
			}
			for(int k=1; k<=M; k++) {
				dp[1][k]=k;
			}
			for(int x=2; x<=N; x++) {
				for(int y=2; y<=M;y++) {
					dp[x][y]=dp[x][y-1]+dp[x-1][y-1];
				}
			}
			System.out.println(dp[N][M]);
		}
    }
}