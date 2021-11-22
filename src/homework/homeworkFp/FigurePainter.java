package homework.homeworkFp;

public class FigurePainter {

    void firstFp(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println(c + " ");
        }
    }

    void secondFp() {
        for (int i = 0; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void thirdFp() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    void fourthFp() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }

            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    void fifthFp() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");

            }
            System.out.println();
        }

    }
}
