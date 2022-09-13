package javabase.deng;


public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n){
        if(n == 0){
            return false;
        }
        while(n % 2 == 0){
            n /= 2;
        }
        if(n == 1){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPowerOfTwo1(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            if ((n & (n - 1)) == 0) {
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        boolean flag = isPowerOfTwo1(32);
        System.out.println(flag);
    }
}
