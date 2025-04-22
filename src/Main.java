// 1-6. 중복문자제거


import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if(set.contains(c)) continue;
            set.add(c);
            sb.append(c);
        }
        System.out.println(sb.toString());

    }

}

