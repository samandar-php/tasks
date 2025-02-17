package If;

import java.util.Scanner;

public class If_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0 && a < 10) {
            if (a % 2 == 0) {
                System.out.println("1 xonali juft son");
            } else {
                System.out.println("1 xonali toq son");
            }
        } else if (a > 9 && a < 100) {
            if (a % 2 == 0) {
                System.out.println("2 xonali juft son");
            } else {
                System.out.println("2 xonali toq son");
            }
        } else {
            if (a % 2 == 0) {
                System.out.println("3 xonali juft son");
            } else {
                System.out.println("3 xonali toq son");
            }
        }
    }
}

