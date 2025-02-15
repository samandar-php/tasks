package begin;

import java.util.Scanner;

public class begin_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V1 = input.nextInt();
        int V2 = input.nextInt();
        int S = input.nextInt();
        int T = input.nextInt();
        System.out.println(Math.abs(S - (V1 + V2) * T));
    }
}
