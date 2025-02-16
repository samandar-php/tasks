package integer;

import java.util.Scanner;

public class integer_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 10;
        int c = a % 10;
        int d = c * 10 + b;
        System.out.println(d);
    }
}
