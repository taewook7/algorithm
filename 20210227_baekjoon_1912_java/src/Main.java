import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String[] st=br.readLine().split(" ");
        int[] arr = new int[n];
        int[] dp = new int[n];
        int max;
        
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(st[i]);
        }
        dp[0] = arr[0];
        max = arr[0];
        for(int i=1; i<n; i++) {
        	dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
        	max=Math.max(max, dp[i]);
        }
        System.out.println(max);
        
    }
 
}