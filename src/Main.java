// 1-12. 암호

import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < n; i++) {
            String tmpStr = str.substring(0, 7);
            str = str.substring(7);

            StringBuilder sb = new StringBuilder();
            for (char c : tmpStr.toCharArray()) {
                if(c=='#') sb.append("1");
                else sb.append("0");
            }
            bw.write((char) Integer.parseInt(sb.toString(), 2));
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
