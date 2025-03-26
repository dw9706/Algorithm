package hashMap_treeSet;
// 4-6. K번째 큰 수
import java.util.Collections;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Arrays;

public class KthLargestNumber {
// 중요! 내림차순 정렬된 배열이라도 삼중 루프 순서가 항상 내림차순의 순서를 보장하는건 아니다!!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] nums = new Integer[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, nums));
    }

    public static int solution(int n, int k, Integer[] nums) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        Arrays.sort(nums, Collections.reverseOrder()); // Wrapper 배열만 가능
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int z = j+1; z < n; z++) {
                    set.add(nums[i]+nums[j]+nums[z]);
                }
            }
        }
        int cnt = 0;
        for (int tmp : set) {
            cnt++;
            if(cnt==k) return tmp;
        }
        return -1;
    }
}
