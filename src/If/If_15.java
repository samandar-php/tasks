package If;

import java.util.Scanner;

public class If_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && a > c) {
            System.out.println(b + c);
        } else if (b > a && b > c) {
            System.out.println(a + c);
        } else {
            System.out.println(a + b);
        }
    }
}
