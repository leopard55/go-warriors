package javabase.java8;

/**
 * @Title: Formula
 * @Description: Default Methods for Interfaces
 * @Author: lz
 * @CreateDate: 2020/10/19 15:59
 * @Version: 1.0
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Formula formula = new Formula(){
            @Override
            public double calculate(int a){
                return sqrt(a*100);
            }
        };
        double d1= formula.calculate(100);
        double d2 = formula.sqrt(16);
        System.out.println(d1 + "," + d2);

    }
}