package dfs_bfs;
// 8-4. 중복순열

import java.util.*;
public class FindPermutationsWithRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] answer = new int[m];
        DFS(n, m, answer, 0);
    }

    public static void DFS(int n, int m, int[] answer, int level) {
        if (level == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            answer[level] = i;
            DFS(n, m, answer, level + 1);
            answer[level] = 0;
        }
    }
}
