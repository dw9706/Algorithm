package dynamicProgramming;
// 10-3 최대 부분 증가 수열

import java.util.*;
public class LIS {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] dy = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && max < dy[j]) {
                    max = dy[j];
                }
            }
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
        }
        System.out.println(answer);
    }
}
