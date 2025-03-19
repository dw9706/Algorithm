package twoPointer_SlidingWindow;

import java.util.Scanner;
//3-1. 두 배열 합치기
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
        int[] answer = new int[n + m];
        int ptr_n = 0;
        int ptr_m = 0;
        int ptr_answer = 0;
        while (ptr_n < n && ptr_m < m) {
            if (n_array[ptr_n] > m_array[ptr_m]) {
                answer[ptr_answer] = m_array[ptr_m];
                ptr_m++;
            } else {
                answer[ptr_answer] = n_array[ptr_n];
                ptr_n++;
            }
            ptr_answer++;
        }
        while (ptr_n < n) {
            answer[ptr_answer] = n_array[ptr_n];
            ptr_answer++;
            ptr_n++;
        }
        while (ptr_m < m) {
            answer[ptr_answer] = m_array[ptr_m];
            ptr_answer++;
            ptr_m++;
        }

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
