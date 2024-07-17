package Recurrence.Practice;

// Recurrence.Practice2_1
// 최대공약수를 재귀함수로 구현하시오.

// 3 : [1,3]
// 5 : [1,5]
// 최대 공약수: 3 * 5 = 15

// 8: [1,2,4,8]
// 12: [1,2,3,4,6,12]
// 최대 공약수: 8 * 3 = 24

public class Practice2_1 {
    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
//      Test code
        System.out.println(gcd(3, 5));
        System.out.println(gcd(2, 6));
        System.out.println(gcd(8, 12));
    }
}
