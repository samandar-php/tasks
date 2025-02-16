package func;

import java.util.Scanner;

public class func_08 {
    public static int Quarter(int x ,int y){
        if (x > 0 && y > 0){
            return 1;
        }else if (x < 0 && y > 0) {
            return 2;
        }else if (x < 0 && y < 0) {
            return 3;
        }else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(Quarter(x,y));
    }
}
