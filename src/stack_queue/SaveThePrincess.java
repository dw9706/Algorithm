package stack_queue;
// 5-6. 공주 구하기
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class SaveThePrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }

    public static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        while (queue.size() != 1) {
            for (int i = 0; i < k - 1; i++) queue.offer(queue.poll());
            queue.poll();
        }
        return queue.poll();
    }
}
