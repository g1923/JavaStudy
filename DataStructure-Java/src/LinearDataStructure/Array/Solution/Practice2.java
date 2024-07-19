package LinearDataStructure.Array.Solution;// Practice2
// 배열 arr 에서 target 에 해당하는 값의 인덱스를 출력
// 해당 값이 여러 개인 경우 가장 큰 인덱스 출력

// 입출력 예시)
// 배열 arr: 1, 1, 100, 1, 1, 1, 100
// 결과: 6

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
        int target = 100;
        int idxMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i > idxMax) {
                    idxMax = i;
                }
            }
        }

        if (idxMax >= 0) {
            System.out.println(idxMax);
        }
    }
    
    // 내가 작성한 코드
    void MySolution () {
        int[] arr = {1,1,100,1,1,1,100};

        int targer = 100; // 찾고하는 숫자의 인덱스(단, 가장 큰 인덱스를 출력)
        int bigNumIndex = 0;

        bigNumIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targer) {
                if (i > bigNumIndex) {
                    bigNumIndex = i;
                }
            }

        }

        if (bigNumIndex >= 0) {
            System.out.println(bigNumIndex);
        } else {
            System.out.println("해당하는 값이 배열에 포함되어 있지 않습니다.");
        }


    }
}
