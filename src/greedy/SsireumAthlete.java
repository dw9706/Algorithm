package greedy;
//9-1. 씨름선수

import java.util.*;

public class SsireumAthlete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Player> players = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            players.add(new Player(h, w));
        }
        System.out.println(solution(n, players));

    }

    public static int solution(int n, ArrayList<Player> players) {
        int answer = 0;
        Collections.sort(players);
        int maxW = Integer.MIN_VALUE;
        for (Player p : players) {
            if (maxW < p.w) {
                maxW = p.w;
                answer++;
            }
        }
        return answer;
    }
}

class Player implements Comparable<Player> {
    public int h;
    public int w;

    Player(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Player o) {
        return o.h - this.h;
    }
}