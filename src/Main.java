// 3-2. 공통원소 구하기


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Integer[] A = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        Integer[] B = new Integer[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int Aptr = 0; int Bptr = 0;

        while (Aptr < n && Bptr < m) {
            if(A[Aptr].equals(B[Bptr])){
                bw.write(A[Aptr]+" ");
                Aptr++;
                Bptr++;
            }
            else if(A[Aptr] < B[Bptr]) Aptr++;
            else if(A[Aptr] > B[Bptr]) Bptr++;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}

