package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        // 일반 for문
        for (int i = 0; i < num.length; i++) {
            int number = num[i];
            System.out.println(number);
        }

        // 향상된 for문, for-each문
        for (int number : num) {
            System.out.println(number);
        }

        // iter 단축키 누르면 향상된 for문 나옴
//        for (int i : num) {
//
//        }
    }

}
