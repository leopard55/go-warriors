package javacore.listdemo;

import java.util.ArrayList;

/**
 * @Title: Demo1
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/6/12 19:54
 * @Version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        //1. JDK 1.5版本时的集合
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add(true);
        list.add(100);  // 自动上转型
        list.add(12.3);
        System.out.println(list.size());
        System.out.println(list.toString());
        // 1.查看集合中的元素
        System.out.println(list);

        //将所有的数字*100

        // 2.获取指定索引处集合的元素list.get(index)
        Object obj = list.get(3);
        if(obj instanceof Integer) { // 判断obj是否是属于整型类型
            int num = (Integer)obj;
            System.out.println(num * 100);
        }
        System.out.println(obj);

        Integer n = (Integer)list.get(0); // 下转型 java.lang.ClassCastException 类型转换异常

        // 工作中，集合中推荐大家使用同一种数据类型
        // 为了解决Object下转型带来的安全问题，最终在JDK1.5版本提出了一个全新概念：泛型
        // 泛型：表示广泛类型（通用类型的规范）
        // 语法：<任意类型> <T> <E> <K, V> 当自己需要定义泛型时，建议使用大写字母
        ArrayList<Object> objects = new ArrayList<>();
    }
}













