import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int i, j, row = 4;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
