package Permutation.Practice;

// Combinations.Practice1
// 1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순서 O, 중복 x)의 각 결과를 출력하시오

public class Practice1 {

    void permutation(int[] arr, int depth, int n, int r) {
        //재기함수 구조. 자기자신을 계속호출함. => 탈출하는 구문이 필요함.

    }

    public static void main(String[] args) {
//      Test code
        int[] arr = {1, 2, 3, 4};

        Practice1 p = new Practice1();
        p.permutation(arr, 0, 4, 3);
    }
}
