package CodingTest;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

// [백준 문제 1021번] 회전하는 큐 https://www.acmicpc.net/problem/1021
// [참고](https://st-lab.tistory.com/216)
public class Day2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        // 뽑아내려고 하는 수의 위치가 순서대로 주어진다
//        String[] input2 = scanner.nextLine().split(" ");

        // 큐의 크기 N
        int N = Integer.parseInt(input1[0]);
        // 뽑아낼 개수 M
        int M = Integer.parseInt(input1[1]);

        // 큐 생성 ( 1 ~ N )
        Deque<Integer> deque = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        // 뽑아내려는 수 배열에 담기
        int[] select = new int[M];
        for(int i = 0; i < M; i++) {
            select[i] = scanner.nextInt();
        }

        int cnt = 0;

        // 뽑고자하는 인덱스를 찾기위해서 LinkedList로 변환
        LinkedList<Integer> list = (LinkedList<Integer>) deque;
        for (int i = 0; i < select.length; i++) {
            // 뽑고자하는 숫자의 위치 찾기
            int target_idx = list.indexOf(select[i]);

            // 큐의 중간 값을 찾고
            // 중간보다 앞에있으면 뒤로 보내기 (2)
            // 큐의 중간 값보다 뒤에 있으면 앞으로 보내기 (3)
            // 이때 큐의 크기가 짝수이면 중간값을 찾을 때 -1 처리한다.
            int mid = 0;
            if (deque.size() % 2 == 0) {
                mid = deque.size() / 2 - 1;
            } else {
                mid = deque.size() / 2;
            }

            if (target_idx <= mid) {
                // 2번 target_idx가 나올때까지 앞의 수를 빼서 맨뒤로 보낸다.
                for (int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.addLast(temp);
                    cnt ++;
                }
            } else {
                // 3번 target_idx가 나올대까지 뒤의 수를 빼서 맨앞으로 보낸다.
                for (int j = deque.size() - 1; j >= target_idx; j--) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }
            // 연산이 끝나면 맨 앞의 원소(찾고있던 원소) 제거하기
            deque.pollFirst();

        }

        System.out.println(cnt);
    }
}