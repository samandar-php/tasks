package func;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class func_10 {
    public static boolean IsSquare(int a){
        return pow(sqrt(a),2) == a ;
    }
    public static void main(String[] args) {
        System.out.println(IsSquare(65));
    }
}
