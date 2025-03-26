package stack_queue;
// 5-2. 괄호문자제거

import java.util.Scanner;

import java.util.Stack;
public class RemoveParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c != ')') {
                stack.push(c);
            } else {
                while (stack.pop() != '(');
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
