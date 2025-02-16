package integer;

import java.util.Scanner;

public class integer_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a % 7;
        System.out.println(b);
    }
}
