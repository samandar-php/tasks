package If;

import java.util.Scanner;

public class If_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int g = scanner.nextInt();
        int d = 0;
        int c = 0;
        if (a > 0) {
            d++;
        } else {
            c++;
        }
        if (b > 0) {
            d++;
        } else {
            c++;
        }
        if (g > 0) {
            d++;
        } else {
            c++;
        }
        System.out.println(d);
        System.out.println(c);
    }
}
