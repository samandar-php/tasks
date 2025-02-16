package integer;

import java.util.Scanner;

public class integer_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a % 3600;
        System.out.println(b);
    }
}
