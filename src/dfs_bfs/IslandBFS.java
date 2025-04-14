package dfs_bfs;
// 8-14. 섬나라 아일랜드 (BFS)

import java.util.*;

public class IslandBFS {
    private static int[][] board;
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int answer = 0;
    public static void main(String[] args) {
        IslandBFS T = new IslandBFS();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    T.BFS(n, i, j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public void BFS(int n, int x, int y) {
        Queue<Pos> queue = new LinkedList<>();
        board[x][y] = 0;
        queue.offer(new Pos(x, y));
        while (!queue.isEmpty()) {
            Pos poll = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.offer(new Pos(nx, ny));
                }
            }
        }
    }

    class Pos {
        public int x;
        public int y;

        Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
