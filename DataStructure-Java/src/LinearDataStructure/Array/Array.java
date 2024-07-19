package LinearDataStructure.Array;

import java.util.Arrays;

// 선형 자료구조 - 배열
public class Array {

    public static void main(String[] args) {

//      1차원 배열
        System.out.println("== 1차원 배열 ==");
        int[] arr = {1, 2, 3, 4, 5};
        for (int item: arr) {
            System.out.println("item = " + item);
        }

        arr[1] = 100;
        System.out.println("arr = " + arr);


//      2차원 배열
        System.out.println("== 2차원 배열 ==");
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr2[0][1]);

        for(int[] row: arr2) {
            for(int item: row) {
                System.out.println("item = " + item);
            }
        }


//      Array - 1차원, 2차원
        System.out.println("== Array ==");
        java.util.ArrayList list1 = new java.util.ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);
        list1.add(4);
        list1.add(5);
        System.out.println("list1 = " + list1);
        list1.remove(2);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1);

        java.util.ArrayList list2d = new java.util.ArrayList();
        java.util.ArrayList list1d1 = new java.util.ArrayList(Arrays.asList(1, 2, 3));
        java.util.ArrayList list1d2 = new java.util.ArrayList(Arrays.asList(4, 5, 6));
        list2d.add(list1d1);
        list2d.add(list1d2);
        System.out.println("list1d1 = " + list1d1);
        System.out.println("list1d2 = " + list1d2);
        System.out.println("list2d = " + list2d);
    }
}
