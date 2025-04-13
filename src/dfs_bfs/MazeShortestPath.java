package dfs_bfs;

import java.util.*;

// 8-11. 미로의 최단거리 통로
public class MazeShortestPath {
    private static int[][] maze = new int[8][8];
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        System.out.println(BFS(1, 1));

    }

    public static int BFS(int sx, int sy) {
        Queue<Pos> queue = new LinkedList<>();
        queue.offer(new Pos(sx, sy, 0));
        while (!queue.isEmpty()) {
            Pos poll = queue.poll();
            if(poll.x == 7 & poll.y == 7) return poll.level;
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + dx[i];
                int ny = poll.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 & ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    queue.offer(new Pos(nx, ny, poll.level + 1));
                }
            }
        }
        return -1;
    }
}
class Pos {
    Pos(int x, int y, int level) {
        this.x = x;
        this.y = y;
        this.level = level;
    }
    public int x;
    public int y;
    public int level;

}
