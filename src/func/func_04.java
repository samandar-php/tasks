package func;

import java.util.Scanner;

import static java.lang.Math.pow;

public class func_04 {
    public static double RingS(double R1,double R2){
        return Math.PI*pow(R1,2) - Math.PI*pow(R2,2);
    }
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println(RingS(a,b));

    }
}
