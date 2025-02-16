package func;

public class func_09 {
    public static boolean Even(int K){
            return ( K%2 == 0);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Even(i));
        }
    }
}
