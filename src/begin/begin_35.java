package begin;

import java.util.Scanner;

public class begin_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V = input.nextInt();
        int U = input.nextInt();
        int T1 = input.nextInt();
        int T2 = input.nextInt();
        System.out.println( (V * T1 + U * T2));
    }
}
