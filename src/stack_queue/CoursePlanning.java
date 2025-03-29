package stack_queue;
// 5-7. 교육과정 설계

import java.util.Scanner;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
public class CoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        HashMap<Character, Integer> essentialMap = new HashMap<>();
        Queue<Character> essentialQ = new LinkedList<>();
        for (Character c : str1.toCharArray()) {
            essentialQ.offer(c);
            essentialMap.put(c, 1);
        }

        for (Character c : str2.toCharArray()) {
            if (essentialMap.containsKey(c) && essentialQ.poll() != c) return "NO";
        }
        if(!essentialQ.isEmpty()) return "NO";

        return "YES";

    }
}
