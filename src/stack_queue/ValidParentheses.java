package stack_queue;
// 5-1. 올바른 괄호
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                if (stack.isEmpty()) return "NO";
                stack.pop();
                continue;
            }
            stack.add(c);
        }

        if(!stack.isEmpty()) return "NO";
        return "YES";
    }
}
