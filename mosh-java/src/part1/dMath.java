package part1;

public class dMath {
    public static void main(String[] args) {
        int result = Math.round(1.1F); // 1  四舍五入
        int result1 = (int) Math.ceil(1.1F); //2 上限
        int result2 = (int) Math.floor(1.1F); //1 下限
        int max =  Math.max(1, 2);
        int min = Math.min(1, 2);
        double random = Math.random();  // 介于0-1之间的浮点数
        int random1 = (int) Math.round(Math.random() * 100);
        int ramdon2 = (int) (Math.random() * 100);
        System.out.print(random1);

    }
}