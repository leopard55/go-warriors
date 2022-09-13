package javacore.array1;

/**
 * @Title: Test
 * @Description: 自己编写MyArray类，其中的add()可以使用重载要求此方法能实现到达容量3/4是扩容1.5倍
 * @Author: lz
 * @CreateDate: 2021/5/6 15:35
 * @Version: 1.0
 */
public class TestMyArray {
    public static void main(String[] args) {
        // 类似于JDK1.5版本之前的ArrayList
        MyArray arr = new MyArray();//通过无参创建出的自定义数组长度为10

        arr.add("abc"); // String 上转型为Object类型
        arr.add(true);
        arr.add(12);
        arr.add(12.9);

        Integer obj = (Integer)arr.get(0); // java.lang.ClassCastException

        // 泛型出现了，现在需要升级自定义数组，泛型自定义数组
        // 将类型的检查从运行期提前到了编译期，有效解决了下转型存在安全隐患
    }
}
