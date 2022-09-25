public class StarFor1 {
    public static void main(String[] args) {
        // *****
        // 하나의 문자 출력을 for문으로 반복해 별모양을 출력
        // System.out.print("*");
        for (int i = 10; i < 60; i += 10) {
            System.out.print("*");
        }

        System.out.println(); // 구분짓기
        // *
        // *
        // *
        // *
        // *
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            System.out.println();
        }

        System.out.println();
        /*
         * *****
         * *****
         * *****
         * *****
         * *****
         * 중첩 for문
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * 11111
         * 22222
         * 33333
         * 44444
         * 55555
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }



        System.out.println();



        int start = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(start);
            }
            start++;
            System.out.println();
        }

        System.out.println();



        /*
         * 12345
         * 12345
         * 12345
         * 12345
         * 12345
         */

        for (int i = 0; i < 5; i++) {
            int start1 = 1; // 밑 반복문이 끝났을 때 다시 start1 값이 1로 돌아오기때문에 여기에 위치
            for (int j = 0; j < 5; j++) { // 안쪽 반복문을 먼저 집중해보는게 중요
                System.out.print(start1);
                start1++; // 증가되는 값이 행렬에 따라 위 반복문과 위치를 비교해보면 이해하기 쉬움
            }
            System.out.println();
        }

    }
}
