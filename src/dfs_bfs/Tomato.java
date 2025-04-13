package dfs_bfs;
// 8-12. 토마토

import java.util.*;

public class Tomato {
    private static int[][] tomatoes;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        tomatoes = new int[n][m];
        Queue<Pos2> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tomatoes[i][j] = sc.nextInt();
                if(tomatoes[i][j] == 1) queue.offer(new Pos2(i, j));
            }
        }
        answer = BFS(n, m, queue);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomatoes[i][j] == 0) {
                    answer = -1;
                    break;
                }
            }
            if(answer == -1) break;
        }

        System.out.println(answer);

    }

    public static int BFS(int n, int m, Queue<Pos2> queue) {
        int day = -1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Pos2 poll = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = poll.x + dx[j];
                    int ny = poll.y + dy[j];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && tomatoes[nx][ny] == 0) {
                        tomatoes[nx][ny] = 1;
                        queue.offer(new Pos2(nx, ny));
                    }
                }
            }
            day++;
        }
        return day;
    }



}
class Pos2 {
    public Pos2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x;
    public int y;
}

