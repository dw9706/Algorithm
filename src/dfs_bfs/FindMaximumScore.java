package dfs_bfs;
// 8-3. 최대점수 구하기

import java.util.*;

public class FindMaximumScore {
    private static int answer = Integer.MIN_VALUE;
    private static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] scores = new int[n];
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            times[i] = sc.nextInt();
        }
        DFS(scores, times, 0, 0, 0);
        System.out.println(answer);

    }

    public static void DFS(int[] scores, int[] times, int sum_score, int sum_times, int level) {
        if (sum_times > m) return;
        if (level == n) {
            answer = Math.max(sum_score, answer);
            return;
        }
        DFS(scores, times, sum_score + scores[level], sum_times + times[level], level + 1);
        DFS(scores, times, sum_score, sum_times, level + 1);
    }
}
