import java.util.Scanner;

public class PatternFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square (minimum 4 recommended): ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= 2) {
                    // First two columns are #
                    System.out.print("# ");
                } else if (j == 3) {
                    // Third column is * for first row, then ###
                    if (i == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                } else {
                    // Fourth column alternates * # * #
                    if (i % 2 == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("# ");
                    }
                }
            }
            System.out.println();
        }
    }
}
