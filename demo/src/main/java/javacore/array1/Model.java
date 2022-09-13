package javacore.array1;

/**
 * @Title: Model
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/6/13 11:15
 * @Version: 1.0
 */
//public class Model<T, E> {
public class Model<T> {
    public void test(T t){  //泛型的替换原则：一改全改
        System.out.println(t);
    }

//    public void test(Object obj) { // 虽然通用，但是下转型需要判断后强转才能使用
//
//    }

//    public void test(String obj) {
//
//    }
//
//    public void test(int obj) {
//
//    }
//
//    public void test(boolean obj) {
//
//    }

    private T t;
    private T[] arr = (T[]) new Object[12]; // 无法直接创建出泛型数组，必须通过Object创建后强转

    public T returnObj() {
        return t;
    }

    public T[] getArray() { // 泛型数组
        return arr;
    }

//    public Object returnObj() {
//
//    }

    // 最特殊的情况
    public <E> E info(E obj) {
        // <E>声明新的泛型： 当方法泛型与类的泛型不一致时
        // <E> E 中的E就是方法的返回类型
        // info(E obj) 中的E是形参类型
        return obj;
    }
}
