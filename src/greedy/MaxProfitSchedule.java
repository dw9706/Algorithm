package greedy;
//9-4. 최대 수입 스케쥴

import java.util.*;

public class MaxProfitSchedule {
    private static PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    private static List<Lecture> lectures = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastDay = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            lastDay = Math.max(lastDay, d);
            lectures.add(new Lecture(m, d));
        }
        System.out.println(solution(n, lastDay));
    }

    public static int solution(int n, int lastDay) {
        Collections.sort(lectures, Collections.reverseOrder());
        int answer = 0;
        int j = 0;
        for (int i = lastDay; i > 0; i--) {
            for (; j < n; j++) {
                if (lectures.get(j).d < i) break;
                queue.offer(lectures.get(j).m);
            }
            if(!queue.isEmpty()) answer += queue.poll();
        }
        return answer;

    }
}

class Lecture implements Comparable<Lecture> {
    public int m;
    public int d;

    public Lecture(int m, int d) {
        this.m = m;
        this.d = d;
    }

    @Override
    public int compareTo(Lecture o) {
        return this.d - o.d;
    }

}