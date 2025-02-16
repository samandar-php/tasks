package integer;

import java.util.Scanner;

public class integer_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = a * b / c;
        int e = a * b % c;
        System.out.println(d);
        System.out.println(e);
    }
}
