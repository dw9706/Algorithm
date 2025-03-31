package sorting_searching;
// 6-3. 삽입정렬
import java.util.*;

public class InsertionSort {
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
        for (int i = 1; i < n; i++) {
            int tmp = nums[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (tmp < nums[j]) nums[j + 1] = nums[j];
                else break;
            }
            nums[j + 1] = tmp;
        }
        for (int tmp : nums) {
            System.out.print(tmp + " ");
        }
    }
}

