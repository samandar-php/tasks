package integer;

import java.util.Scanner;

public class integer_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int e = d * 100 + c * 10 + b;
        System.out.println(e);
    }
}
