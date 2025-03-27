package stack_queue;
// 5-4. 후위식 연산

import java.util.Scanner;
import java.util.Stack;
public class Postfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (Character c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Integer.parseInt(String.valueOf(c)));
                continue;
            }
            Integer num1 = stack.pop();
            Integer num2 = stack.pop();
            if (c == '-') {
                stack.push(num2 - num1);
            } else if (c == '+') {
                stack.push(num2 + num1);

            } else if (c == '*') {
                stack.push(num2 * num1);

            } else {
                stack.push(num2 / num1);
            }
        }
        return stack.pop();

    }
}
