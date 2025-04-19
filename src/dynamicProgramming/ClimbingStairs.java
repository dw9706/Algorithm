package dynamicProgramming;
// 10-1. 계단 오르기

import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stairs = new int[n + 1];
        stairs[1] = 1;
        stairs[2] = 2;
        for (int i = 3; i <= n; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
        System.out.println(stairs[n]);
    }
}
