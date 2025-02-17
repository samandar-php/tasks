package If;

import java.util.Scanner;

public class If_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double f;
        if (x <= 0) {
            f = -x;
        } else if (x < 2) {
            f = x * x;
        } else {
            f = 4;
        }
        System.out.println(f);
    }
}
