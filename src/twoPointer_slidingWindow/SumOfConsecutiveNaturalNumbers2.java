package twoPointer_slidingWindow;
// 3-5. 연속된 자연수의 합(수학)

import java.util.Scanner;

public class SumOfConsecutiveNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if(n%cnt==0) answer++;
        }
        return answer;
    }
}
