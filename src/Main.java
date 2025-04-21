//5-4. 후위식 연산

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String postfix = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) stack.push(Character.getNumericValue(c));
            else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int result = 0;
                if (c == '+') {
                    result = num1 + num2;
                } else if (c == '-') {
                    result = num1 - num2;
                } else if (c == '/') {
                    result = num1 / num2;
                } else if (c == '*') {
                    result = num1 * num2;
                }
                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }
}

