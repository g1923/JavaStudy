package Complexity;

// 기초 수학 - 알고리즘 복잡도
public class Complexity {
    static int fibonacci(int n) {
        if (n < 3) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
//  재귀함수를 만들어서 재귀호출을 하게되면서 내부적으로 함수 call 스택정보가 스택이라는 공간에 계속 메모리가 (N번만큼) 쌓임
    static int factorial(int n) {
        if (n < 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

//      1. 시간 복잡도
        System.out.println("== 시간 복잡도 ==");

//      O(1) : 출력연산 한번 실행되는것, 많은 입력값 중에서 특정 값을 인덱싱하여 바로 출력하는것,
//      입력값 n이 몇이되든 상관없이 그 해당위치에 대한 해당 인덱싱 한번만 하면된다.
        System.out.println("== O(1) ==");
        System.out.println("hello");

//      O(logN) : 입력값에 대하여 logN번만큼만 연산이 이뤄지는 것
//        log16 = 4
        System.out.println("== O(logN) ==");
        for (int i = 1; i < 16; i*=2) {
            System.out.println("hello");
        }

//      O(N) : N번에 대하여 N번만큼 다 연산되는것
        System.out.println("== O(N) ==");
        for (int i = 0; i < 2; i++) {
            System.out.println("hello");
        }

//      O(NlogN) : (이중 for문 형식) 상위 for문은 N번만큼 하위 for문은 logN번만큼
        System.out.println("== O(NlogN) ==");
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 8; j*=2) {
                System.out.println("hello");
            }
        }

//      O(N^2) : N번만큼 이뤄지는 for문이 이중으로 이뤄졌을때
        System.out.println("== O(N^2) ==");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("hello ");
            }
            System.out.println();
        }

//      O(2^N)
        System.out.println("== O(2^N) ==");
//      피보나치 재귀
//      1, 1, 2, 3, 5, 8, 13, ...
        System.out.println(fibonacci(6));


//      2. 공간 복잡도
        System.out.println("== 공간 복잡도 ==");
//      O(N)
        System.out.println("== O(N) ==");
        // 팩토리얼 : 시간복잡도면에서도 빅오형태임.
        int n = 3;
        System.out.println(factorial(n));

//      O(1)
        System.out.println("== O(1) ==");
        // 메모리관점에선 o(1) 이지만 시간복잡도에서는 o(N)임.
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
