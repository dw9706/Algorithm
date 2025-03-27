package stack_queue;
//5-5. 쇠막대기
import java.util.Scanner;
import java.util.Stack;

public class IronRod {
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        String iron = sc.nextLine();
        System.out.println(solution(iron));
    }

    public static int solution(String iron) {
        int cnt = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < iron.length(); i++) {
            if(iron.charAt(i) == '(') stack.push('(');
            else {
                stack.pop();
                if(iron.charAt(i-1) == '(') cnt += stack.size();
                else cnt++;
            }
        }

        return cnt;
    }
}
