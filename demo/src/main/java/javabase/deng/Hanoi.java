package javabase.deng;

/**
* @Author:         lz
* @CreateDate:     2019-07-01 20:30
 *
 * 汉诺塔
*/


public class Hanoi {

    public static void hanoi(int n ,char A, char B, char C){
        if(n == 1){
            System.out.println(A+"->"+C);
        }
        else{
            hanoi(n-1, A, C, B);
            System.out.println(A+"->"+C);
            hanoi(n-1, B, A, C);
        }
    }

    public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }
}
