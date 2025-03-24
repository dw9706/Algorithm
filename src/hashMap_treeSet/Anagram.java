package hashMap_treeSet;
// 4-2. 아나그램

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(solution(str1, str2));
    }

    public static String solution(String str1, String str2) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (Character c : str1.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        for (Character c : str2.toCharArray()) {
            if (!hash.containsKey(c) || hash.get(c) == 0) {
                return "NO";
            }
            hash.put(c, hash.get(c) - 1);
        }
        return "YES";
    }
}
