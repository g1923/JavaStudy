package Final_Practice;//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PracticeN {
    public static boolean solution(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (set.add(n)) { // 이미 존재하는 값이면 add가 되지 않기때문에 while문을 벗어나게 된다.
            int sqaureSum = 0;

            while (n > 0) {
                int remain = n % 10; // 1 의 자리
                sqaureSum += remain * remain;
                n /= 10; // 10의 자리
            }

            if (sqaureSum == 1) {
                return true;
            } else {
                n = sqaureSum;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(19));
        System.out.println(solution(2));
        System.out.println(solution(61));
    }
}
