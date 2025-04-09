package dfs_bfs;
// 8-2. 바둑이 승차

import java.util.*;

public class DogTruckLoading {
    private static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        DFS(c, n, nums, 0, 0);
        System.out.println(answer);
    }

    public static void DFS(int c, int n, int[] nums, int sum, int level) {
        if(sum > c) return;
        if (level == n) {
            answer = Math.max(sum, answer);
            return;
        }
        DFS(c, n, nums, sum + nums[level], level + 1);
        DFS(c, n, nums, sum, level + 1);
    }
}
