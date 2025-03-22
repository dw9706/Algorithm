package twoPointer_slidingWindow;
// 3-5. 연속된 자연수의 합(two pointer)

import java.util.Scanner;
public class SumOfConsecutiveNaturalNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int cnt = 0;
        int lt = 1;
        int sum = 0;
        for (int rt = 1; rt <= n / 2 + 1; rt++) {
            sum += rt;
            if(sum==n) cnt++;
            while (sum >= n) {
                sum -= lt++;
                if(sum==n) cnt++;
            }
        }
        return cnt;
    }
}
