package stack_queue;
// 5-7. 교육과정 설계

import java.util.Scanner;
import java.util.HashMap;
import java.util.Stack;
public class CoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        HashMap<Character, Integer> essentialMap = new HashMap<>();
        Stack<Character> essentialStack = new Stack<>();
        String reverse = new StringBuilder(str1).reverse().toString();
        for (Character c : reverse.toCharArray()) {
            essentialMap.put(c, 1);
            essentialStack.push(c);
        }

        for (Character c : str2.toCharArray()) {
            if (essentialMap.containsKey(c) && essentialStack.pop() != c) return "NO";
        }
        if(!essentialStack.isEmpty()) return "NO";

        return "YES";

    }
}
