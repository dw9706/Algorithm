package dfs_bfs;
//8-5. 동전교환
import java.util.*;
public class CoinChange {
    private static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(coins, Collections.reverseOrder());
        DFS(n, coins, m, 0);
        System.out.println(answer);
    }

    public static void DFS(int n, Integer[] coins, int remain, int level) {
        if(remain < 0 || answer < level) return;
        if (remain == 0) {
            answer = Math.min(level, answer);
        }
        for (int i = 0; i < n; i++) {
            DFS(n, coins, remain - coins[i], level + 1);
        }
    }

}
