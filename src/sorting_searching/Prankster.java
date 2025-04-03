package sorting_searching;
// 6-6. 장난꾸러기

import java.util.*;
public class Prankster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        solution(n, nums);
    }

    public static void solution(int n, int[] nums) {
        String answer = "";
        int[] sort_nums = new int[n];
        for (int i = 0; i < n; i++) {
            sort_nums[i] = nums[i];
        }
        Arrays.sort(sort_nums);

        for (int i = 0; i < n; i++) {
            if(sort_nums[i] != nums[i]) answer = answer + (i+1) + " ";
        }

        System.out.println(answer);
    }
}
