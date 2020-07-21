package hackerslank;

public class Staircase {
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int j = n - i; j <= n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
