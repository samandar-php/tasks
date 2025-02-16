package func;

public class func_07 {
    public static int Calc(int a , int b , int c){
       return switch (c){
            case 1 -> a-b;
            case 2 -> a + b;
            case 3 -> a*b;
            case 4 -> a/b;
           default -> 0 ;
        };
    }
    public static void main(String[] args) {
        System.out.println(Calc(10,5,1));
    }
}
