//2-5. 소수


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] check = new int[n + 1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (check[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    check[j] = 1;
                }
            }
        }
        System.out.println(answer);
    }

}

