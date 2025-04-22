// 1-3. 문장 속 단어


import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        String answer = "";

        int len = st.countTokens();
        for (int i = 0; i < len; i++) {
            String tmp = st.nextToken();
            if (max < tmp.length()) {
                max = tmp.length();
                answer = tmp;
            }
        }

        System.out.println(answer);
}

}

