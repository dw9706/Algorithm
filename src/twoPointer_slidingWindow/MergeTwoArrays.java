package twoPointer_slidingWindow;

//3-1. 두 배열 합치기
import java.util.Scanner;
import java.util.ArrayList;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] n_array = new int[n];
        for (int i = 0; i < n; i++) {
            n_array[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] m_array = new int[m];
        for (int i = 0; i < m; i++) {
            m_array[i] = sc.nextInt();
        }
        solution(n, m, n_array, m_array);
    }

    public static void solution(int n, int m, int[] n_array, int[] m_array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int ptr_n = 0;
        int ptr_m = 0;
        while (ptr_n < n && ptr_m < m) {
            if (n_array[ptr_n] > m_array[ptr_m]) {
                answer.add(m_array[ptr_m++]);
            } else {
                answer.add(n_array[ptr_n++]);
            }
        }
        while (ptr_n < n) {
            answer.add(n_array[ptr_n++]);
        }
        while (ptr_m < m) {
            answer.add(m_array[ptr_m++]);
        }

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
