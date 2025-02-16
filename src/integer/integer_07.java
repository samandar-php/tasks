package integer;

import java.util.Scanner;

public class integer_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 10;
        int c = a % 10;
        int d = b + c;
        int e = b * c;
        System.out.println(d);
        System.out.println(e);
    }
}
