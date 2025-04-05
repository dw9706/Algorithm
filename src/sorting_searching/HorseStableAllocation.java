package sorting_searching;
// 6-10. 마구간 정하기 (결정알고리즘)

import java.util.*;

public class HorseStableAllocation {
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
        Arrays.sort(nums);
        int lt = 1;
        int rt = nums[n - 1];
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(n, mid, nums) >= m) {
                answer = mid;
                lt = mid + 1;
            } else rt = mid - 1;
        }
        return answer;
    }

    public static int count(int n, int mid, int[] nums) {
        int cnt = 1;
        int pos = nums[0];
        for (int i = 1; i < n; i++) {
            if ((nums[i] - pos) >= mid) {
                cnt++;
                pos = nums[i];
            }
        }
        return cnt;
    }
}
