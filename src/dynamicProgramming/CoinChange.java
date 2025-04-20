package dynamicProgramming;
// 10-5. 동전교환
import java.util.*;
import java.io.*;
public class CoinChange {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Integer[] coins = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        Arrays.sort(coins);
        int[] dy = new int[m + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);

        dy[0]= 0;
        for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coins[i]] + 1);
            }
        }
        bw.write(dy[m] + "");
        bw.flush();
        br.close();
        bw.close();
    }
}
