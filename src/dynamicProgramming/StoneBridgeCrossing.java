package dynamicProgramming;
// 10-2. 돌다리 건너기

import java.util.*;

public class StoneBridgeCrossing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dy = new int[n + 2];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        System.out.println(dy[n + 1]);
    }

}
