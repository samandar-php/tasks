package If;

import java.util.Scanner;

public class If_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a-8);
        }else {
            System.out.println(a);
        }
    }
}
