package greedy;
// 9-5. 다익스트라

import java.util.*;

public class Dijkstra {
    private static ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>());
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            graph.get(s).add(new Edge(e, c));

        }
        solution(n, m);
    }

    public static void solution(int n, int m) {
        int[] dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        dis[1] = 0;
        pQ.offer(new Edge(1, 0));

        while (!pQ.isEmpty()) {
            Edge poll = pQ.poll();
            int nowVertex = poll.vertex;
            int nowCost = poll.cost;
            if (nowCost > dis[nowVertex]) continue;
            for (Edge edge : graph.get(nowVertex)) {
                if (dis[edge.vertex] > nowCost + edge.cost) {
                    dis[edge.vertex] = nowCost + edge.cost;
                    pQ.offer(new Edge(edge.vertex, dis[edge.vertex]));
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }
    }


}

class Edge implements Comparable<Edge> {
    public int vertex;
    public int cost;

    public Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}
