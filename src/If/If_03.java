package If;

import java.util.Scanner;

public class If_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a - 8);
        } else if (a < 0) {
            System.out.println(a + 6);
        } else {
            System.out.println(a + 10);
        }
    }
}
