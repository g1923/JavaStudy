package CodingTest;

import java.util.*;

// [백준 문제 10818번] 최소, 최대 https://www.acmicpc.net/problem/10818
public class Day3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 정수의 개수 (1 <= N <= 1,000,000)
        int N = scanner.nextInt();

        // N개의 정수들
        ArrayList<Integer> arr = new ArrayList<>();
        int[] intArrays = new int[N];
        for (int i = 0; i < N; i++) {
            intArrays[i] = scanner.nextInt();
        }

        int min = intArrays[0], max = intArrays[0];

        for (int i = 0; i < N; i ++) {
            if (intArrays[i] < min) {
                min = intArrays[i];
            }

            if (intArrays[i] > max) {
                max =  intArrays[i];
            }
        }

        // 결과 출력
        System.out.println(min + " " + max);
    }
}
