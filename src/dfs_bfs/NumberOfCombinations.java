package dfs_bfs;
// 8-7. 조합의 경우수

import java.util.*;

public class NumberOfCombinations {
    private static int[][] check;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        check = new int[n+1][r+1];
        DFS(n, r);
        System.out.println(check[n][r]);
    }

    public static int DFS(int n, int r) {
        if (check[n][r] != 0) return check[n][r];
        if (n == r || r == 0) return 1;
        check[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        return check[n][r];
    }
}
