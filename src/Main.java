// 10-4. 가장 높은 탑 쌓기


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            bricks.add(new Brick(s, h, w));
        }
        Collections.sort(bricks);
        int[] dy = new int[n];
        dy[0] = bricks.get(0).h;
        int answer = 0;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if(bricks.get(i).w < bricks.get(j).w) max = Math.max(max, dy[j]);
            }
            dy[i] = max + bricks.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        System.out.println(answer);

        br.close();
    }
}

class Brick implements Comparable<Brick> {
    public int s;
    public int h;
    public int w;

    public Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s;
    }
}

