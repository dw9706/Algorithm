// 1-3. 문장 속 단어


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();

        int lt = 0;
        int rt = arr.length - 1;
        while (lt < rt) {
            if (Character.isAlphabetic(arr[lt]) && Character.isAlphabetic(arr[rt])) {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                rt--; lt++;
            } else if(!Character.isAlphabetic(arr[rt])) rt--;
            else if(!Character.isAlphabetic(arr[lt])) lt++;
        }
        System.out.println(String.valueOf(arr));
    }

}

