// 2-10. 봉우리

import java.util.*;
import java.io.*;
public class Main {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }



        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isBonguri(board, i ,j)) answer++;
            }
        }
        System.out.println(answer);
    }

    public static boolean isBonguri(int[][] board, int i, int j) {
        int n = board.length;
        for (int k = 0; k < 4; k++) {
            int n_i = i + dx[k];
            int n_j = j + dy[k];
            if (0 <= n_i && n_i < n && 0 <= n_j && n_j < n) {
                if (board[n_i][n_j] >= board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}


