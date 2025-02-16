package func;

import java.util.Scanner;

public class func_01 {
    public static double Sign(double a){
        if (a < 0){
            return -1;
        }
        if (a > 0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(Sign(a) + Sign(b));

    }
}
