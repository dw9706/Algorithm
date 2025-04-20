package dynamicProgramming;
// 10-4. 가장 높은 탑 쌓기

import java.io.*;
import java.util.*;
public class TowerStacking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Block> blocks = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int e = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            blocks.add(new Block(e, h, w));
        }
        br.close();

        Collections.sort(blocks);
        int answer = 0;
        int[] dy = new int[n];
        dy[0] = blocks.get(0).h;
        for (int i = 1; i < n; i++) {
            int nowH = blocks.get(i).h;
            int nowW = blocks.get(i).w;
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (blocks.get(j).w > nowW && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + nowH;
            answer = Math.max(answer, dy[i]);
        }
        wr.write(answer+"");
        wr.flush();
        wr.close();
    }
}

class Block implements Comparable<Block> {
    public int e;
    public int h;
    public int w;

    public Block(int e, int h, int w) {
        this.e = e;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Block o) {
        return o.e - this.e;
    }

}