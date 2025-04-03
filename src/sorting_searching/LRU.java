package sorting_searching;
// 6-4. LRU
import java.util.*;
public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] works = new int[n];
        for (int i = 0; i < n; i++) {
            works[i] = sc.nextInt();
        }
        solution(s, n, works);
    }

    public static void solution(int s, int n, int[] works) {
        Deque<Integer> cache = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        for (int work : works) {
            if (cache.contains(work)) {
                int tmp;
                while ((tmp = cache.pop()) != work) {
                    stack.push(tmp);
                }
                while (!stack.isEmpty()) {
                    cache.push(stack.pop());
                }
                cache.push(work);
            } else {
                if(cache.size() == s) cache.removeLast();
                cache.push(work);
            }
        }

        for (int work : cache) {
            System.out.print(work + " ");
        }
    }
}
