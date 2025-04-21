// 1-4. 단어 뒤집기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char[] arr = br.readLine().toCharArray();
            int lt = 0;
            int rt = arr.length - 1;
            while (lt < rt) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++; rt--;
            }
            bw.write(String.valueOf(arr));
            bw.write(System.lineSeparator());
        }

        bw.flush();
        br.close();
        br.close();
    }
}
