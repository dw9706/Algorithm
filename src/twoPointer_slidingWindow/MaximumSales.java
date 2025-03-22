package twoPointer_slidingWindow;
// 3-3. 최대 매출

import java.util.Scanner;
public class MaximumSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] days = new int[n];
        for (int i = 0; i < n; i++) {
            days[i] = sc.nextInt();
        }

        System.out.println(solution(n, k, days));
    }

    public static int solution(int n, int k, int[] days) {
        int maximum = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += days[i];
        }
        maximum = sum;
        for (int i = k; i < n; i++) {
            sum = sum + days[i] - days[i - k];
            maximum = Math.max(maximum, sum);
        }
        return maximum;
    }
}
