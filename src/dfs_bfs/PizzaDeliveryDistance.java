package dfs_bfs;
// 8-14. 피자배달거리

import java.util.*;

public class PizzaDeliveryDistance {
    private static int[][] board;
    private static ArrayList<Pos3> pz = new ArrayList<>();
    private static ArrayList<Pos3> hs = new ArrayList<>();
    private static Pos3[] combi;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        board = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 2) pz.add(new Pos3(i, j));
                if (board[i][j] == 1) hs.add(new Pos3(i, j));
            }
        }
        combi = new Pos3[m];
        DFS(m, 0, 0);
        System.out.println(answer);

    }

    public static void DFS(int m, int s, int level) {
        if (level == m) {
            int sum = 0;
            for (Pos3 house : hs) {
                int tmp = Integer.MAX_VALUE;
                for (Pos3 pizza : combi) {
                    tmp = Math.min(tmp, Math.abs(house.x - pizza.x) + Math.abs(pizza.y - house.y));
                }
                sum += tmp;
            }
            answer = Math.min(sum,answer);
            return;
        }
        for (int i = s; i < pz.size(); i++) {
            combi[level] = pz.get(i);
            DFS(m, i + 1, level + 1);
        }
    }




}
class Pos3{
    public int x;
    public int y;

    Pos3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

