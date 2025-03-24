package hashMap_treeSet;
// 4-3. 매출액의 종류

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class TypesOfSalesAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        solution(n, k, nums);
    }

    public static void solution(int n, int k, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        answer.add(map.size());


        for (int i = k; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            map.put(nums[i-k], map.get(nums[i-k])-1);
            if(map.get(nums[i-k])==0) map.remove(nums[i-k]);
            answer.add(map.size());
        }

        for (int tmp : answer) {
            System.out.print(tmp + " ");
        }

    }
}
