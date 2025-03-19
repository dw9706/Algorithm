package twoPointer_SlidingWindow;
// 3-2. 공통 원소 구하기

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElements {
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
        Arrays.sort(n_array);
        Arrays.sort(m_array);
        int ptr_n = 0;
        int ptr_m = 0;
        while (ptr_n < n && ptr_m < m) {
            if (n_array[ptr_n] == m_array[ptr_m]) {
                answer.add(n_array[ptr_n++]);
                ptr_m++;
            } else if (n_array[ptr_n] > m_array[ptr_m]) {
                ptr_m++;
            } else {
                ptr_n++;
            }
        }
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
