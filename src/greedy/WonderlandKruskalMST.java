package greedy;
//9-7. 원더랜드 최소 스패닝 트리 - 크루스칼)

import java.util.*;

public class WonderlandKruskalMST {
    private static ArrayList<Edge1> edges = new ArrayList<>();
    private static int[] unf;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        unf = new int[v + 1];
        for (int i = 1; i <= v; i++) unf[i] = i;
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            edges.add(new Edge1(v1, v2, cost));
        }
        System.out.println(solution(v));
    }

    public static int solution(int v) {
        Collections.sort(edges);
        int answer = 0;
        int n = 0;
        for (Edge1 edge : edges) {
            if(n == v-1) break;
            int fv1 = Find(edge.v1);
            int fv2 = Find(edge.v2);
            if (fv1 != fv2) {
                Union(edge.v1, edge.v2);
                n++;
                answer += edge.cost;
            }
        }
        return answer;
    }

    public static void Union(int v1, int v2) {
        int fv1 = Find(v1);
        int fv2 = Find(v2);
        if(fv1 != fv2) unf[fv1] = fv2;
    }

    public static int Find(int v) {
        if(v == unf[v]) return unf[v];
        else return unf[v] = Find(unf[v]);
    }

    
}

class Edge1 implements Comparable<Edge1> {
    public int v1;
    public int v2;
    public int cost;

    public Edge1(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge1 o) {
        return this.cost - o.cost;
    }


}
