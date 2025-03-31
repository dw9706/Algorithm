package sorting_searching;
//6-1. 선택정렬
import java.util.*;
public class SelectionSort {
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
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int tmp : nums) {
            System.out.print(tmp + " ");
        }
    }
}
