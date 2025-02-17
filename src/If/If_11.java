package If;

import java.util.Scanner;

public class If_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a != b) {
            if (a > b) {
                b = a;
            } else {
                a = b;
            }
        } else {
            a = 0;
            b = 0;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
