package greedy;
//9-3 결혼식
import java.util.*;
public class Wedding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            times.add(new Time(s, 's'));
            times.add(new Time(e, 'e'));
        }
        System.out.println(solution(n, times));
    }

    public static int solution(int n, ArrayList<Time> times) {
        int answer = 0;
        Collections.sort(times);
        int cnt = 0;
        for (Time time : times) {
            if(time.state == 's') cnt++;
            else cnt--;
            answer = Math.max(cnt, answer);
        }
        return answer;
    }
}

class Time implements Comparable<Time> {
    int t;
    char state;

    Time(int t, char state) {
        this.t = t;
        this.state = state;
    }

    @Override
    public int compareTo(Time o) {
        if(this.t == o.t) return this.state - o.state;
        return this.t - o.t;
    }
}