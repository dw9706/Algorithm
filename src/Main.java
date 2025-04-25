//5-8. 응급실

import java.util.*;
import java.io.*;

public class Main {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[m][n];

        Queue<Pos> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1) queue.offer(new Pos(i, j));
            }
        }
        while (!queue.isEmpty()) {
            Pos p = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];
                if (0 <= nx && nx < m && 0 <= ny && ny < n && board[nx][ny] == 0) {
                    queue.offer(new Pos(nx, ny));
                    board[nx][ny] = board[p.x][p.y] + 1;
                }
            }
        }
        int answer = checkAnswer(n, m, board);
        System.out.println(answer);
    }
    public static int checkAnswer(int n, int m, int[][] board){
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0) {
                    return -1;
                }
                answer = Math.max(answer, board[i][j]);
            }
        }
        return answer -1;
    };

}


class Pos {
    public int x;
    public int y;

    Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
