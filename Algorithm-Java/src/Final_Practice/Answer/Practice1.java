package Final_Practice.Answer;
import java.util.ArrayList;

public class Practice1 {
    public static ArrayList<ArrayList<Integer>> solution(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            // 각행에 대한 파스칼삼각형의 수 담기
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    // 각 행의 양 끝은 1로 정의한다.
                    list.add(1);
                } else {
                    // 상단 왼쪽 오른쪽 값을 각각 더해준다.
                    int x = result.get(i - 1).get(j - 1);
                    int y = result.get(i - 1).get(j);
                    list.add(x + y);
                }
            }
            result.add(list);
        }

        return result;
    }


    public static void main(String[] args) {
        // Test code
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
}
