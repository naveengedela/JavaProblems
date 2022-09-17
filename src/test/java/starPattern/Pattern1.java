package starPattern;

public class Pattern1 {
    public static void main(String[] args) {
        pattern30(5);
    }

    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Formula >> n +1 -r (1st index) and n + 1 - row (0th index)
    private static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColInRow;

            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print("  ");
            }

            for (int col = 0; col < totalColInRow; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    private static void pattern30(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n -row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + "  ");
            }
            for (int col1 =2; col1 < row; col1++) {
                System.out.print(col1 + "  ");
            }
            System.out.println();
        }
    }

}
