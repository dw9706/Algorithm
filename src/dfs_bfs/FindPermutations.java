package dfs_bfs;
//8-6. 순열 구하기
import java.util.*;
public class FindPermutations {
    private static int[] check;
    private static int[] answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        check = new int[n];
        answer = new int[m];
        DFS(n, m, nums, 0);
    }

    public static void DFS(int n, int m, int[] nums, int level) {
        if (level == m) {
            for (int i = 0; i < m; i++) System.out.print(answer[i]+" ");
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (check[i] == 0) {
                check[i] = 1;
                answer[level] = nums[i];
                DFS(n, m, nums, level + 1);
                check[i] = 0;
            }
        }
    }
}
