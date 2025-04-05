package sorting_searching;
// 6-8. 이분 검색

import java.util.*;
public class BinarySearch {
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
        Arrays.sort(nums);
        int lt = 0;
        int rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (nums[mid] == m) {
                answer = mid + 1;
                break;
            }
            if(nums[mid] < m) lt = mid + 1;
            else rt = mid - 1;
        }
        return answer;
    }
}
