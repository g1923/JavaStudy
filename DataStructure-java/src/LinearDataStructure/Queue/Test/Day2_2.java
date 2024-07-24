package LinearDataStructure.Queue.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// [프로그래머스] 기능개발 https://school.programmers.co.kr/learn/courses/30/lessons/42586?language=java
public class Day2_2 {

    public static void main(String[] args) {

        System.out.println("== 예시 1==");
        int[] progresses2 = {93, 30, 55};
        int[] speeds2 = {1, 30, 5};

        int[] solution = solution(progresses2, speeds2);
        System.out.println("solution : " + Arrays.toString(solution));

        System.out.println();
        System.out.println("== 예시 2==");
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] solution2 = solution(progresses, speeds);
        System.out.println("solution2 : " + Arrays.toString(solution2));

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        // 배포가 가능한 일은 앞의 일이 선행되어야 하므로 큐를 이용한다.
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (int) Math.ceil((double) remain / speeds[i]); // 나머지가 있다면 올림을 해야함
            queue.add(days);
        }

        System.out.println(queue);

        ArrayList<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            // poll : 큐 앞쪽에 데이터를 제거하고 반환
            int current = queue.poll();
            int cnt = 1;

            // 현재 작업보다 더 빨리 끝나는 작업들을 묶어서 배포
            // peek : 큐 앞쪽에 있는 데이터를 제거핮 않고 반환
            while (!queue.isEmpty() && queue.peek() <= current) {
                cnt++;
                queue.poll();
            }

            result.add(cnt);
        }

        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

}
