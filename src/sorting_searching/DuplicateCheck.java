package sorting_searching;
// 6-5. 중복확인

import java.util.*;
public class DuplicateCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, nums));
    }

    public static String solution(int n, int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i+1]) return "D";
        }
        return "U";
    }
}
