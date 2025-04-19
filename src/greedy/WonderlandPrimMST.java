package greedy;
// 9-8. 원더랜드(최소 스패닝 트리 - 프림)

import java.util.*;
public class WonderlandPrimMST {
    private static ArrayList<ArrayList<Edge2>> graph = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        for(int i = 0; i <=v;i++) graph.add(new ArrayList<Edge2>());
        for (int i = 0; i < e; i++) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int cost = sc.nextInt();
            graph.get(c1).add(new Edge2(c2, cost));
            graph.get(c2).add(new Edge2(c1, cost));
        }
        System.out.println(solution(v));
    }

    public static int solution(int v) {
        PriorityQueue<Edge2> pq = new PriorityQueue<>();
        int[] check = new int[v + 1];
        int answer = 0;

        pq.offer(new Edge2(2, 0));
        while (!pq.isEmpty()) {
            Edge2 poll = pq.poll();
            if(check[poll.e] == 1) continue;
            check[poll.e] = 1;
            answer += poll.cost;
            for (Edge2 e : graph.get(poll.e)) {
                if(check[e.e] == 1) continue;
                pq.offer(e);
            }
        }
        return answer;
    }
}
class Edge2 implements Comparable<Edge2>{
    public int e;
    public int cost;

    public Edge2(int e, int cost) {
        this.e = e;
        this.cost = cost;
    }

    public int compareTo(Edge2 o) {
        return this.cost - o.cost;
    }
}