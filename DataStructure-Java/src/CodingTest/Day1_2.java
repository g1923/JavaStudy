package CodingTest;

import java.util.Stack;

// 문제.같은숫자는 싫어 (https://school.programmers.co.kr/learn/courses/30/lessons/12906)
public class Day1_2 {

    public class Solution {
        //  [1,1,3,3,0,1,1]  => [1,3,0,1]
        //  [4,4,4,3,3]	=> [4,3]

        public int[] solution(int []arr) {
            Stack<Integer> stack = new Stack<>();

            for (int i : arr) {
                if (stack.isEmpty()) {
                    stack.push(i);
                }

                if (!stack.isEmpty() && stack.peek() != i)
                    stack.push(i);
            }

            int[] answer = new int[stack.size()];

            for (int i = 0; i < stack.size(); i++) {
                answer[i] = stack.get(i);
            }

            return answer;
        }
    }
}
