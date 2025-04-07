package recursive_tree_graph;

// 7-8. 송아지 찾기 1

import java.util.*;

public class FindingCalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution(s, e));
    }

    public static int solution(int s, int e) {
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] dis = {1, -1, 5};
        queue.offer(s);
        map.put(s, 1);
        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int num = queue.poll();
                for (int j = 0; j < 3; j++) {
                    int tmp = num + dis[j];
                    if(tmp == e) return level+1;
                    if(!map.containsKey(tmp)){
                        map.put(tmp, 1);
                        queue.offer(tmp);
                    }

                }
            }
            level++;
        }
        return level;
    }
}

