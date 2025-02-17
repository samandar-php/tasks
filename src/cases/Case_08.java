package cases;

import java.util.Scanner;

public class Case_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int M = scanner.nextInt();
        if (D == 1) {
            M = (M == 1) ? 12 : M - 1;
            D = switch (M) {
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };
        } else {
            D--;
        }
        System.out.println(D);
        System.out.println(M);
    }
}
