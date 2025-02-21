package string;

import java.util.Scanner;

public class string09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char C1 = scanner.next().charAt(0);
        char C2 = scanner.next().charAt(0);
        for (int i = 0; i < N; i++) {
            System.out.print((i % 2 == 0) ? C1 : C2);
        }
    }
}
