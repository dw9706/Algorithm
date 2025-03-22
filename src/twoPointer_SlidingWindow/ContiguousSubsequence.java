package twoPointer_SlidingWindow;
// 3-4 연속 부분수열

import java.util.Scanner;

public class ContiguousSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, nums));
    }

    public static int solution(int n, int m, int[] nums) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum == m) answer++;
            while (sum >= m) {
                sum -= nums[lt++];
                if(sum == m) answer++;
            }
        }
        return answer;
    }
}
