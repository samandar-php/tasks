package integer;

import java.util.Scanner;

public class integer_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = (a - 1) / 100 + 1;
        System.out.println(b);
    }
}
