//1-10. 가장 짧은 문자거리

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();
        char alpha = sc.next().charAt(0);

        int[] check = new int[arr.length];

        int pos = 1000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == alpha) pos = 0;
            else check[i] = ++pos;
        }

        pos = 1000;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == alpha) pos = 0;
            else check[i] = Math.min(check[i], ++pos);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(check[i] + " ");
        }

    }
}

