package dfs_bfs;
// 8-1. 합이 같은 부분 집합

import java.util.*;

public class EqualSubsetSum {
    private static String answer = "NO";
    private static int total = 0;
    private static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            total += nums[i];
        }
        DFS(n, nums, 0, 0);
        System.out.println(answer);


    }

    public static void DFS(int n, int[] nums,int sum, int level) {
        if (n == level) {
            if((total-sum) == sum){
                answer = "YES";
                flag = true;
            }
            return;
        }
        if(flag || (sum > total / 2)) return;
        DFS(n, nums, sum + nums[level], level + 1);
        DFS(n, nums, sum, level + 1);
    }

}
