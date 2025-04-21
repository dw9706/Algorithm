package dynamicProgramming;
//10-6. 최대점수 구하기

import java.util.*;
import java.io.*;
public class MaxScore {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] dy = new int[m+1];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            for (int j = m; j >= t; j--) {
                dy[j] = Math.max(dy[j], dy[j - t] + s);
            }
        }

        bw.write(dy[m] + "");


        bw.flush();
        br.close();
        bw.close();
    }

}

