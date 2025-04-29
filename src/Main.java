// 8-8. 수열 추측하기.

import java.util.*;
public class Main {
    private static int[] answer;
    private static int[] check;
    private static int[] b;
    private static int[][] dy = new int[10][10];
    private static int n;
    private static int f;
    private static boolean flag = false;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        answer = new int[n];
        check = new int[n+1];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = combi(n-1, i);
        }
        DFS(0,0);
    }

    public static void DFS(int level,int sum) {
        if(flag) return;
        if (level == n) {
            if (sum == f) {
                Arrays.stream(answer).forEach(i -> System.out.print(i + " "));
                flag = true;
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (check[i] == 0) {
                answer[level] = i;
                check[i] = 1;
                DFS(level+1,sum + (b[level] * i));
                check[i] = 0;
            }
        }

    }

    public static int combi(int n, int r) {
        if(dy[n][r] != 0) return dy[n][r];
        if(n == r || r == 0) return 1;
        return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
    }



}


