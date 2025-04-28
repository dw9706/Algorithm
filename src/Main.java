//5-5. 쇠막대기

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sticks = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        char pre = ' ';
        int answer = 0;
        for(char c : sticks.toCharArray()){
            if(c == '(') stack.push(c);
            else{
                stack.pop();
                if(pre == ')') answer++;
                else{
                    answer += stack.size();
                }
            }
            pre = c;
        }
        System.out.println(answer);
    }
}


