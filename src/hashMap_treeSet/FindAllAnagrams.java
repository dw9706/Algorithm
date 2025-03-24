package hashMap_treeSet;
// 4-4. 모든 아나그램 찾기

import java.util.HashMap;
import java.util.Scanner;
public class FindAllAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(solution(s1, s2));
    }

    public static int solution(String s1, String s2) {
        int answer = 0;
        HashMap<Character, Integer> s1m = new HashMap<>();
        HashMap<Character, Integer> s2m = new HashMap<>();
        for (Character c : s2.toCharArray()) {
            s2m.put(c, s2m.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s2.length() - 1; i++) {
            s1m.put(s1.charAt(i), s1m.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int lt = 0;
        for (int rt = s2.length() - 1; rt < s1.length(); rt++) {
            s1m.put(s1.charAt(rt), s1m.getOrDefault(s1.charAt(rt), 0) + 1);
            if(s1m.equals(s2m)) answer++;
            s1m.put(s1.charAt(lt), s1m.get(s1.charAt(lt)) - 1);
            if(s1m.get(s1.charAt(lt))==0) s1m.remove(s1.charAt(lt));
            lt++;
        }
        return answer;
    }
}
