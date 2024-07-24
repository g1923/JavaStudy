package CodingTest;

import java.util.*;

// [프로그래머스] 나누어 떨어지는 숫자 배열 https://school.programmers.co.kr/learn/courses/30/lessons/12910
public class Day3_2 {

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        // divisor로 나누어 떨어지는 값 찾기
        ArrayList<Integer> list = new ArrayList<>();
        for (int n: arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        // 나누어 떨어지는 값이 없으면 -1 넣어주기
        if (list.isEmpty()) {
            answer = new int[]{-1};
            return  answer;
        }

        // 오름차순 정렬 (버블 정렬)
        for (int i = 0; i < list.size() - 1 ; i++) {
            for (int j = 0; j < list.size() - 1 - i; j ++) {
                if (list.get(j) > list.get(j + 1)) {
                    int tmp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, tmp);
                }

            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 2. Collections.sort() 사용하기
    public static int[] solution2(int[] arr, int divisor) {
        int[] answer = {};

        // divisor로 나누어 떨어지는 값 찾기
        ArrayList<Integer> list = new ArrayList<>();
        for (int n: arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        // 나누어 떨어지는 값이 없으면 -1 넣어주기
        if (list.isEmpty()) {
            answer = new int[]{-1};
            return  answer;
        }

        Collections.sort(list);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 2. Arrays.sort() 사용하기
    public static int[] solution3(int[] arr, int divisor) {
        int[] answer = {};

        // divisor로 나누어 떨어지는 값 찾기
        ArrayList<Integer> list = new ArrayList<>();
        for (int n: arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        // 나누어 떨어지는 값이 없으면 -1 넣어주기
        if (list.isEmpty()) {
            answer = new int[]{-1};
            return  answer;
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    // 4. PriorityQueue() 사용하기
    public static int[] solution4(int[] arr, int divisor) {
        int[] answer = {};

        // divisor로 나누어 떨어지는 값 찾기
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int n: arr) {
            if (n % divisor == 0) {
                queue.add(n);
            }
        }

        // 나누어 떨어지는 값이 없으면 -1 넣어주기
        if (queue.isEmpty()) {
            answer = new int[]{-1};
            return  answer;
        }

        answer = new int[queue.size()];
        int index = 0;
        while (!queue.isEmpty()) {
            answer[index++] = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println("== 예제 1 ==");
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        solution(arr1, divisor1); // [5, 10]


        System.out.println("== 예제 2 ==");
        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        solution(arr2, divisor2); // [1, 2, 3, 36]


        System.out.println("== 예제 3 ==");
        int[] arr3 = {3,2,6};
        int divisor3 = 10;
        solution(arr3, divisor3); // [-1]

    }
}
