package LinearDataStructure.LinkedListTest.P4;
// Practice4
// 연결 리스트 배열 사용 연습

// 주어진 문자열 배열을 연결 리스트 배열로 관리하는 코드를 작성하시오.
// 관리 규칙은 다음과 같다.
// 각 문자열의 첫 글자가 같은 것끼리 같은 연결 리스트로 관리하기


import java.util.HashSet;

class Node {
    String data;
    Node next;

    Node() {}
    Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;
    char alphabet;

    LinkedList() {}
    LinkedList(Node node, char alphabet) {
        this.head = node;
        this.alphabet = alphabet;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addData(String data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    public void removeData(String data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node pre = cur;
        while (cur != null) {
            if (cur.data.equals(data)) {
                if (cur == this.head) {
                    this.head = cur.next;
                } else {
                    pre.next = cur.next;
                }
                break;
            }

            pre = cur;
            cur = cur.next;
        }
    }

    public boolean findData(String data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return false;
        }

        Node cur = this.head;
        while (cur != null) {
            if (cur.data.equals(data)) {
                System.out.println("Data exist!");
                return true;
            }
            cur = cur.next;
        }
        System.out.println("Data not found!");
        return false;
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class Practice4 {
    //    [코드 작성]
    public static void dataCollect(String[] data) {
        HashSet<Character> set = new HashSet<>();

        // 중복되지 않는 첫글자를 가진 set
        for (String item: data) {
            set.add(item.toCharArray()[0]);
        }
        System.out.println(set);

        Character[] arr = set.toArray(new Character[0]);
        // 중요 ***
        LinkedList[] linkedList = new LinkedList[set.size()]; // 연결리스트 배열을 위한 공간을 마련, 각각의 위치에 객체가 생성된건 아님.

        // 객체 만들기
        for (int i = 0; i < linkedList.length; i++) {
            // 각각의 위치에 객체 생성하기
            linkedList[i] = new LinkedList(null, arr[i]); // head = null, 각 위치에는 알파벳 첫글자 정보를 담는다.
        }

        for (String item: data) {
            for (LinkedList list: linkedList) {
                if (list.alphabet == item.toCharArray()[0]) {
                    list.addData(item);
                }
            }
        }

        for (LinkedList list: linkedList) {
            System.out.print(list.alphabet + " :");
            list.showData();
        }
    }

    public static void main(String[] args) {
        // Test code
        String[] input = {"apple", "watermelon", "banana", "apricot", "kiwi", "blueberry", "cherry", "orange"};
        dataCollect(input);

        System.out.println();
        String[] input2 = {"ant", "kangaroo", "dog", "cat", "alligator", "duck", "crab", "kitten", "anaconda", "chicken"};
        dataCollect(input2);

    }
}
