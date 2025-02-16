package func;

public class func_06 {
    public  static  int SumRange(int a, int b){
        int count = 0;
        for (int i = a; i <= b ; i++) {
            count+=i;
        }
        return  count;
    }
    public  static  int SumRange(int a, int b,int c){
        int count = 0;
        for (int i = a; i <= b ; i++) {
            count+=i;
        }
        for (int i = b; i <= c; i++) {
            count+=i;
        }
        return  count;
    }
    public static void main(String[] args) {
        int a =10,b=20,c=30;
        System.out.println(SumRange(a,b));
        System.out.println(SumRange(a,b,c));
    }
}
