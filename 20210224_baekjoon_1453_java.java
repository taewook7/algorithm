import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        boolean[] customer = new boolean[101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(st.nextToken());
            if(!customer[a]) customer[a] = true;
            else ans++;
        }
        bw.write(ans + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}