package stack_queue;
// 5-3. 크레인 인형뽑기

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;
public class CraneMachineGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(n, board, m, moves));
    }

    public static int solution(int n, int[][] board, int m, int[] moves) {
        int cnt = 0;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Stack<Integer>> stack_board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Stack<Integer> tmp = new Stack<>();
            for (int j = n-1; j >= 0 ; j--) {
                if(board[j][i] == 0) break;
                tmp.push(board[j][i]);
            }
            stack_board.add(tmp);
        }

        for (int move : moves) {
            Stack<Integer> dolls = stack_board.get(move - 1);
            if(dolls.isEmpty()) continue;
            Integer doll = dolls.pop();
            if (stack.isEmpty() || !stack.peek().equals(doll)) {
                stack.push(doll);
            } else if(!stack.isEmpty() && stack.peek()==doll){
                stack.pop();
                cnt+=2;
            }
        }
        return cnt;
    }
}
