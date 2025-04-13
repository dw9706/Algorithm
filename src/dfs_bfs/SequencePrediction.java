package dfs_bfs;
//8-8. 수열 추측하기

import java.util.*;
public class SequencePrediction {
    private static boolean isFind = false;
    private static int[] check1;
    private static int[] answer;
    private static int[] coefficient; // 이항계수
    private static int[][] check2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        check1 = new int[n+1];
        check2 = new int[n+1][n+1];
        answer = new int[n];
        coefficient = new int[n];
        for (int i = 0; i < n; i++) {
            coefficient[i] = combination(n-1, i);
        }
        DFS(n, f, 0, 0);
    }

    public static int combination(int n ,int r) {
        if(check2[n][r] != 0) return check2[n][r];
        if(r==0 || n==r) return 1;
        return check2[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
    }

    public static void DFS(int n, int f, int level, int sum) {
        if(isFind) return;
        if (level == n) {
            if (f == sum) {
                for (int num : answer) {
                    System.out.print(num + " ");
                }
                isFind = true;
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(check1[i] != 0 ) continue;
            check1[i] = 1;
            answer[level] = i;
            DFS(n, f, level + 1, sum + (i * coefficient[level]));
            check1[i] = 0;
        }
    }
}
