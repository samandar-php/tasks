package integer;

import java.util.Scanner;

public class integer_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int e = b * 100 + d * 10 + c;
        System.out.println(e);
    }
}
