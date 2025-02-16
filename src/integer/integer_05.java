package integer;

import java.util.Scanner;

public class integer_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a % b;
        System.out.println(c);
    }
}
