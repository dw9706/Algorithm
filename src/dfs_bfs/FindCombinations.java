package dfs_bfs;

import java.util.*;

// 8-9. 조합 구하기
public class FindCombinations {
    private static int[] combi;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        combi = new int[m+1];
        DFS(n, m, 1, 0);
    }

    public static void DFS(int n, int m,int s, int level) {
        if (level == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(combi[i]+ " ");
            }
            System.out.println();
            return;
        }
        for (int i = s; i <= n; i++) {
            combi[level] = i;
            DFS(n, m, i+1, level + 1);
        }

    }
}
