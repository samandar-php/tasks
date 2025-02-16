package integer;

import java.util.Scanner;

public class integer_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 60 % 60;
        System.out.println(b);
    }
}
