package LinearDataStructure.Deque;
// Practice2
// 데크 변형
// 기본 데크 구조에서 중간에 데이터를 추가하는 기능을 구현하세요.
// 단, 추가적인 자료구조 생성하지 말고 구현

// 입력 예시)
// 초기 데크 상태 (size: 5)
// -> 1, 2, 3, 4
// 중간 입력: 10
// 결과 데크
// -> 1, 2, 10, 3, 4


import java.util.ArrayDeque;
import java.util.Deque;

class MyDeque3 {
    int[] arr;
    int front = 0;
    int rear = 0;

    MyDeque3(int size) {
        this.arr = new int[size + 1];
        // +1 을 하는 이유?
        // 원형 배열을 상요하기 때문.
        // 배열의 크기를 size + 1 로 설정함으로써 빈 공간을 하나 더 확보하여 포인터가 겹치는 것을 방지하고
        // 큐가 가득 차 있는지 확인하는 작업을 쉽게 할 수 있다.
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (this.rear + 1)  % this.arr.length == this.front;
    }

    public void addFirst(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full!");
            return;
        }

        this.arr[front] = data;
        this.front = (this.front - 1 + this.arr.length) % this.arr.length;
    }

    public void addLast(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full!");
            return;
        }

        this.arr[this.rear] = data;
        this.rear = (this.rear + 1) % this.arr.length;
    }

    // [코드 작성]
    public void addMiddle(int data) {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return;
        }

        // 데크의 원소의 갯수를 찾기
        int elements = this.rear - this.front;
        if (elements < 0) {
            elements = this.arr.length + elements;
        }

        // 중간 지점을 찾는 코드
        int mid = (this.rear - (elements / 2) + this.arr.length) % this.arr.length + 1;

        int start = (this.rear + 1) % this.arr.length;
        int end = (this.rear - elements / 2 + this.arr.length) % this.arr.length;
        for (int i = start; i != end ; i = (i - 1 +this.arr.length) % this.arr.length) {
            this.arr[i] = this.arr[(i - 1 + this.arr.length) % this.arr.length];
        }
        this.arr[mid] = data;
        this.rear = (this.rear + 1) % this.arr.length;
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return null;
        }

        this.front = (this.front + 1) % this.arr.length;
        return this.arr[this.front];
    }

    public Integer removeLast() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty!");
            return null;
        }

        int data = this.arr[this.rear];
        this.rear = (this.rear - 1 + this.arr.length) % this.arr.length;
        return data;
    }

    public void printDeque() {
        int start = (this.front + 1) % this.arr.length;
        int end = (this.rear + 1) % this.arr.length;

        for (int i = start; i != end; i = (i + 1) % this.arr.length) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}

public class Practice5 {
    public static void main(String[] args) {
        // Test code
        MyDeque3 myDeque1 = new MyDeque3(5);
        myDeque1.addLast(1);
        myDeque1.addLast(2);
        myDeque1.addLast(3);
        myDeque1.addLast(4);
        myDeque1.printDeque();

        myDeque1.addMiddle(10);
        myDeque1.printDeque();

        MyDeque3 myDeque2 = new MyDeque3(5);
        myDeque2.addLast(10);
        myDeque2.addLast(10);
        myDeque2.addLast(10);
        myDeque2.addLast(10);
        myDeque2.addLast(10);
        myDeque2.removeFirst();
        myDeque2.removeFirst();
        myDeque2.removeFirst();
        myDeque2.removeFirst();
        myDeque2.addLast(11);
        myDeque2.addLast(12);
        myDeque2.addLast(13);
        myDeque2.printDeque();

        myDeque2.addMiddle(100);
        myDeque2.printDeque();


        MyDeque3 myDeque3 = new MyDeque3(5);
        myDeque3.addFirst(1);
        myDeque3.addFirst(2);
        myDeque3.addFirst(3);
        myDeque3.addFirst(4);
        myDeque3.printDeque();

        myDeque3.addMiddle(10);
        myDeque3.printDeque();
    }
}
