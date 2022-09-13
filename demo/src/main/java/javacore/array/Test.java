package javacore.array;

import java.util.Arrays;

/**
 * @Title: Test
 * @Description: 自己编写MyArray类，其中的add()可以使用重载要求此方法能实现到达容量3/4是扩容1.5倍
 * @Author: lz
 * @CreateDate: 2021/5/6 15:35
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //数组是定长的：一旦创建出数组后，长度就直接被确定了
        String[] strs = new String[10];
        System.out.println(Arrays.toString(strs));

        MyArray arr = new MyArray();//通过无参创建出的自定义数组长度为10

        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("1");
        arr.add("1");
        arr.add("1");
        arr.add("1");
        arr.add("1");

        arr.update(1, "上海");
        System.out.println(arr.display());
        System.out.println(arr.get(8));


        MyArray brr = new MyArray(100);

    }
}
