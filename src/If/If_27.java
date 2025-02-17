package If;

import java.util.Scanner;

public class If_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        int f;
        if (x < 0) {
            f = 0;
        } else if (x % 2 == 0) {
            f = 1;
        } else {
            f = -1;
        }
        System.out.println(f);
    }
}
