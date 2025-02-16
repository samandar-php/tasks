package integer;

import java.util.Scanner;

public class integer_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        System.out.println(b);
        System.out.println(c);
    }
}
