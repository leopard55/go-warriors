package javacore.array1.array;

/**
 * @Title: SuperTest
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/6/13 11:47
 * @Version: 1.0
 */
public class SuperTest {
    public static void main(String[] args) {
        SuperArray<String> list = new SuperArray<>();
        list.add("123");
//        list.add(123);
        String s = list.get(0);

        SuperArray<Integer> list2 = new SuperArray<>();
        list2.add(123);
        Integer integer = list2.get(0);
    }
}
