public class StarFor2 {
    public static void main(String[] args) {
        /*
         * *
         * **
         * ***
         * ****
         * *****
         */
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
            n++;
        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * *****
         * ****
         * ***
         * **
         * *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {

                // 스페이스
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {

                // 별
                System.out.print("*");
            }
            System.out.println(); // 엔터
        }

        /*
         * 12345
         * 23456
         * 34567
         * 45678
         * 56789
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < (i + 5); j++) {
                System.out.print(j);

            }
            System.out.println();

        }

    }
}