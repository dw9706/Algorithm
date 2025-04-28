//1-11. 문자열 압축"

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine()+" ";
        char pre = str.charAt(0);
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            char now = str.charAt(i);
            if(pre == now) cnt++;
            else{
                sb.append(pre);
                sb.append(cnt);
                cnt = 1;
            }
            pre = now;
        }
        String answer = sb.toString().replaceAll("1","");
        System.out.println(answer);
    }
}


