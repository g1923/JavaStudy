package LinearDataStructure.Array.Test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// 문제 25556번(https://www.acmicpc.net/problem/25556)
public class Day1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 순열의 길이 입력
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // n개의 순열 작성
        for (int i = 0; i < n; i ++) {
            arr[i] = scanner.nextInt();
        }

        // 4개의 스택 준비
        Stack<Integer>[] stackArr = new Stack[4];
        for (int i = 0; i < stackArr.length; i++) {
            stackArr[i] = new Stack<Integer>();
        }

        boolean result = true;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean push = false;

            // 스택 중 push가 가능한 곳
            for (Stack<Integer> stack : stackArr) {
                if (stack.isEmpty() || stack.peek() < num) {
                    stack.push(num);
                    push = true;
                    break;
                }
            }

            // 어느 스택에도 넣을 수 없는 경우 push == false
            if (!push) {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
