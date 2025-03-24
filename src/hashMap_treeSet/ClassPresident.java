package hashMap_treeSet;
// 4-1. 학급 회장(해쉬)

import java.util.HashMap;
import java.util.Scanner;
public class ClassPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String str = sc.next();
        System.out.println(solution(n, str));
    }

    public static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hash.put(str.charAt(i), hash.getOrDefault(str.charAt(i), 0)+1);
        }
        int max = 0;
        for (Character c : hash.keySet()) {
            if (hash.get(c) > max) {

                answer = c;
                max = hash.get(c);
            }
        }
        return answer;
    }
}
