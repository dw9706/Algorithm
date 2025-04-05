package sorting_searching;
// 6-7. 좌표 정렬

import java.util.*;
public class SortCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        solution(n, points);
    }

    public static void solution(int n, int[][] points) {
        ArrayList<Point> arr = new ArrayList<>();
        for (int[] point : points) {
            arr.add(new Point(point[0], point[1]));
        }

        Collections.sort(arr);

        for (Point p : arr) {
            System.out.println(p);
        }

    }
}

class Point implements Comparable<Point>{
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        return this.x - o.x;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

}