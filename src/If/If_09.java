package If;

import java.util.Scanner;

public class If_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            a = a / b;
            b = b * a;
        } else {
            b = b / a;
            a = a * b;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
