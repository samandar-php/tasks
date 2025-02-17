package If;

import java.util.Scanner;

public class If_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 0) {
            System.out.println("Nol");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("Musbat juft son");
        } else if (a > 0) {
            System.out.println("Musbat toq son");
        } else if (a % 2 == 0) {
            System.out.println("Salbiy juft son");
        } else {
            System.out.println("Salbiy toq son");
        }
    }
}
