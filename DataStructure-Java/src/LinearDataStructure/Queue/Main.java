package LinearDataStructure.Queue;// 선형 자료구조 - 큐

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Queue 가 인터페이스로 구현되어있다.
        // 바로 객체를 생성하여 만들 수 없다. 각 메소드를 overriding하여 구현한후 사용가능하다.
        // LinkedList에 Queue가 필요한 연산이 구현이 되어있다.
        // 따라서 다형성을 이용하여 할당하여 사용하는 코드를 작성한다.
        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.contains(3));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.poll());

    }
}
