package LinearDataStructure.Stack;// Practice3
// 후위표기법 연산
// 참고 설명) 전위/중위/후위 표기법
// + 1 : 전위 표기법
// 전위 표기법 예1 -> (1+2)*3 => +12*3*
// 후위 표기법 예2 -> 1+2*3 => (1+(2*3)) => +1*23
// 2 + 2 : 중위 표기법
// 3 + : 후위 표기법
// 후위 표기법 예1 -> (1+2)*3 => 12+3*
// 후위 표기법 예2 -> 1+2*3 => (1+(2*3)) => 123*+

// 입출력 예시)
// 입력: "2 2 +"
// 출력: 4

// 입력: "2 2 -"
// 출력: 0


import java.util.Stack;

public class Practice5 {
    public static double calculate(String string) {
        Stack<Double> stack = new Stack();

        for (String str: string.split(" ")) {
            if (str.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (str.equals("-")) {
                stack.push(- stack.pop() + stack.pop());
            } else if (str.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (str.equals("/")) {
                stack.push((1 / stack.pop()) * stack.pop());
            } else {
                // 연산자가 아닌 수가 들어온 경우
                stack.push(Double.parseDouble(str));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(calculate("2 2 +"));    // 4
        System.out.println(calculate("2 2 -"));    // 0
        System.out.println(calculate("2 2 *"));    // 4
        System.out.println(calculate("2 2 /"));    // 1

        System.out.println(calculate("1 1 + 2 * 3 * 2 / 5 -"));    // 1
        System.out.println(calculate("5 2 * 3 - 8 * 4 /"));        // 14

    }
}
