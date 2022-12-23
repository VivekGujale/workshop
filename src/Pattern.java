import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = scanner.nextInt();
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
