package Combinations.Practice;

// Practice
// 1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순서 X, 중복 x)의 각 결과를 출력하시오

public class Practice1 {

    void combination(int[] arr, boolean[] visited, int depth, int n, int r) {




    }

    public static void main(String[] args) {
//      Test code
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = {false, false, false, false};

        Practice1 p = new Practice1();
        p.combination(arr, visited, 0, 4, 3);
    }
}
