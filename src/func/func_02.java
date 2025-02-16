package func;

import java.util.Scanner;

public class func_02 {
    public static int RootCount(double A, double B, double C) {
        double a = B * B - 4 * A * C;
        if (a > 0){
            return 2;
        }
        if (a == 0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        double a = scanner1.nextDouble();
        double b = scanner1.nextDouble();
        double c = scanner1.nextDouble();
        System.out.println(RootCount(a,b,c));
    }
}
