//2-1. 큰 수 출력하기


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(nums[0] + " ");

        for (int i = 1; i < n; i++) {
            if(nums[i] > nums[i-1]) bw.write(nums[i] + " ");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}

