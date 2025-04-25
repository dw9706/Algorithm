//2-3. 가위 바위 보

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st1.nextToken());
            b[i] = Integer.parseInt(st2.nextToken());
        }
        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) System.out.println("D");
            else if (a[i] == 3 && b[i] == 1) System.out.println("B");
            else if (b[i] == 3 && a[i] == 1) System.out.println("A");
            else System.out.println(a[i] > b[i] ? "A" : "B");
        }
    }
}


