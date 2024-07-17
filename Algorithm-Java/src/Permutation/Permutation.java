package Permutation;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

// 기초 수학 - 순열

public class Permutation {
    public static void main(String[] args) {

//      1. 팩토리얼
        System.out.println("== 팩토리얼 ==");
//      5!
        int n = 5;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("result = " + result);

        // IntStream 으로 구현
        System.out.println(Arrays.toString(IntStream.range(1, 6).toArray())); // 1이상 6이하의 값
        // identity: 초기값
        System.out.println(IntStream.range(2, 6).reduce(1, (x, y) -> x * y));
        // 값은 결과이다.
//        System.out.println(IntStream.range(1, 6).reduce((x, y) -> x * y));


//      2. 순열
//      서로 다른 n개 중에 r개를 선택하는 경우의 수 (순서 O, 중복 X)
        System.out.println("== 순열 : P(n,k) = n!/(n-k)! ==");
//      5명을 3줄로 세우는 경우의 수
        // P(5,3) = 5!/(5-3)! = 5!/2! = 5*4*3 = 60
        n = 5;
        int r = 3;
        result = 1;

        for (int i = n; i >= n - r + 1; i--) {
            result *= i;
        }
        System.out.println("result = " + result);


//      3. 중복 순열
//        서로 다른 n개 중에 r개를 선택하는 경우의 수 (순서 O, 중복 O)
        System.out.println("== 중복 순열 :  nPk = n^k ==");
//      서로 다른 4개의 수 중 2개를 뽑는 경우의 수 (중복 허용)
        // 4P2 = 4^2 = 16
        //
        n = 4;
        r = 2;
        result = 1;

        for (int i = 0; i < r; i++) {
            result *= n;
        }
        System.out.println("result = " + result);
        System.out.println(Math.pow(n, r)); // 거듭제곱 연산할때 사용


//      4. 원 순열
//        원 모양의 테이블에 n개의 원소를 나열하는 경우의 수
        System.out.println("== 원 순열 : n!/n = (n-1)! ==");
//      원 모양의 테이블에 3명을 앉히는 경우의 수
        n = 3;
        result = 1;

        for (int i = 1; i < n; i++) {
            result *= i;
        }
        System.out.println("result = " + result);
    }
}
