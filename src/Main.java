//2-2. 보이는 학생

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < nums[i]) {
                answer++;
                max = nums[i];
            }
        }

        System.out.println(answer);

    }
}


