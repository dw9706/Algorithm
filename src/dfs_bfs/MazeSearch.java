package dfs_bfs;
// 8-10. 미로 탐색

import java.util.*;

public class MazeSearch {
    private static int[][] maze = new int[8][8];
    private static int[][] check = new int[8][8];
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        check[1][1] = 1;
        DFS(1, 1);
        System.out.println(cnt);

    }

    public static void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            cnt++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx > 0 && nx < 8 && ny > 0 && ny < 8) {
                if (maze[nx][ny] == 0 && check[nx][ny] == 0) {
                    check[nx][ny] = 1;
                    DFS(nx, ny);
                    check[nx][ny] = 0;
                }
            }
        }
    }
}
