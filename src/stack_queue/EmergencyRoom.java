package stack_queue;
//5-8. 응급실

import java.util.*;


class Person {
    public int idx;
    public int priority;

    public Person(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }
}

public class EmergencyRoom {
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
        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i,nums[i]));
        }
        int answer = 0;
        while (!q.isEmpty()) {
            boolean flag = true;
            Person poll = q.poll();
            for (Person tmp : q) {
                if (poll.priority < tmp.priority) {
                    q.offer(poll);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
                if(poll.idx == m) break;
            }
        }
        return answer;
    }





}
