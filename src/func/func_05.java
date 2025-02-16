package func;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class func_05 {
    public static double TriangleP(double a ,double h){
        return  sqrt((pow(a/2,2)) + pow(h,2)) + h + a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double h = scanner.nextDouble();
        System.out.println(TriangleP(a,h));

    }
}
