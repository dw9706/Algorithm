// 1-7. 회문 문자열


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toUpperCase().toCharArray();

        String answer = "YES";
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                answer = "NO";
                break;
            }
        }

        System.out.println(answer);

    }

}

