// 1-8. 유효한 팰린드롬


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        String answer = "NO";
        if(s.equals(reverse)) answer = "YES";
        System.out.println(answer);
    }

}

