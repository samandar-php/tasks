package begin;

import java.util.Scanner;

import static java.lang.Math.pow;

public class begin_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        System.out.println("A2= " + pow(A,2));
        System.out.println("A4= " + pow(A,4));
        System.out.println("A8= " +pow(A,8));
    }
}
