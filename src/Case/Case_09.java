package Case;

import java.util.Scanner;

public class Case_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int M = scanner.nextInt();
        int a = switch (M) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };

        if (D == a) {
            D = 1;
            M = (M == 12) ? 1 : M + 1;
        } else {
            D++;
        }
        System.out.println(D);
        System.out.println(M);

    }
}
