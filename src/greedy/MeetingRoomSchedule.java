package greedy;
// 9-2. 회의실 배정

import java.util.*;

public class MeetingRoomSchedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            meetings.add(new Meeting(s, e));
        }
        System.out.println(solution(n, meetings));
    }

    public static int solution(int n, ArrayList<Meeting> meetings) {
        int answer = 0;
        Collections.sort(meetings);
        int end = 0;
        for (Meeting meeting : meetings) {
            if (meeting.s >= end) {
                end = meeting.e;
                answer++;
            }
        }
        return answer;
    }
}

class Meeting implements Comparable<Meeting> {
    int s;
    int e;

    Meeting(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Meeting o) {
        if(this.e == o.e) return this.s - o.s;
        return this.e - o.e;
    }
}