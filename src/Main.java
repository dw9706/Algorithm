// 2-9. 격자판 최대합


import java.util.*;
import java.io.*;
public class Main {
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
            int sumRow = 0;
            int sumCol = 0;
            for (int j = 0; j < n; j++) {
                sumRow += board[i][j];
                sumCol += board[j][i];
            }
            answer = Math.max(answer, Math.max(sumRow, sumCol));
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += board[i][i];
            sum2 += board[n - i - 1][i];
        }

        System.out.println(Math.max(answer, Math.max(sum1, sum2)));


    }

}

