//2-04. 피보나치 수열

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pibo = new int[n];

        pibo[0] = 1;
        pibo[1] = 1;
        for (int i = 2; i < n; i++) {
            pibo[i] = pibo[i - 2] + pibo[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        for(int num : pibo){
            sb.append(num + " ");
        }

        System.out.println(sb);
    }
}


