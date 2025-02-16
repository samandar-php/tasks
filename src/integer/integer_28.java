package integer;

import java.util.Scanner;

public class integer_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = (a + b - 1) % 7;
        System.out.println(c);
    }
}
