package If;

import java.util.Scanner;

public class If_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a == b && a == c) {
            System.out.println(4);
        } else if (a == b && a == d) {
            System.out.println(3);
        } else if (a == c && a == d) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
