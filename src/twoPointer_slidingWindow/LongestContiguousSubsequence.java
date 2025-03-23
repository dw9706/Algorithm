package twoPointer_slidingWindow;
// 3-6. 최대 길이 연속부분수열

import java.util.Scanner;

public class LongestContiguousSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, nums));
    }

    public static int solution(int n, int k, int[] nums) {
        int answer = 0;
        int lt = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == 0) cnt++;
            while (cnt > k) {
                if(nums[lt++] == 0) cnt--;
            }
            answer = Math.max(answer, i - lt + 1);
        }
        return answer;
    }
}
