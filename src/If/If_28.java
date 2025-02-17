package If;

import java.util.Scanner;

public class If_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            b = 366;
        } else {
            b = 365;
        }
        System.out.println(b);
    }
}
