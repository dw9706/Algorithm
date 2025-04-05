package sorting_searching;
// 6-9. 뮤직비디오(결정알고리즘)
import java.util.*;
public class MusicVideo {
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
        int lt = Arrays.stream(nums).max().getAsInt();
        int rt = Arrays.stream(nums).sum();
        int answer = 0;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(mid, nums) <= m) {
                answer = mid;
                rt = mid - 1;
            } else lt = mid + 1;
        }
        return answer;
    }

    public static int count(int mid, int[] nums) {
        int cnt = 1;
        int sum = 0;
        for (int n : nums) {
            if ((sum + n) > mid) {
                cnt++;
                sum = 0;
            }
            sum += n;
        }
        return cnt;
    }
}
