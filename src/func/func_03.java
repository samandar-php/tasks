package func;

import java.util.Scanner;

import static java.lang.Math.pow;

public class func_03 {
    public static double CircleS(double R){
        return Math.PI*pow(R,2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();
        System.out.println(CircleS(R));
    }
}
