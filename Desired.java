public class Desired {

    public static void printPattern() {
            int n = 5;


            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j < 2 * i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }


            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("* ");
                }
                for (int j = 1; j < 2 * i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }


        public static void main(String[] args) {
            System.out.println(" Desired Pattern");
            printPattern();
        }
    }

