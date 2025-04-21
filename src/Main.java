// 1-2. 대소문자 변환

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {
             if(Character.isUpperCase(arr[i])) arr[i] = Character.toLowerCase(arr[i]);
             else arr[i] = Character.toUpperCase(arr[i]);
        }
        System.out.println(String.valueOf(arr));
    }
}
