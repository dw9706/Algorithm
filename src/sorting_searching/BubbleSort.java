package sorting_searching;
// 6-2. 버블정렬

import java.util.*;
public class BubbleSort {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        solution(n, nums);
    }

    public static void solution(int n, int[] nums) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
        for (int tmp : nums) {
            System.out.print(tmp + " ");
        }
    }
}
