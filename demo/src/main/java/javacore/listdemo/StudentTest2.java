package javacore.listdemo;

import java.util.ArrayList;

/**
 * @Title: StudentTest2
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/7/1 10:12
 * @Version: 1.0
 */
public class StudentTest2 {
    public static void main(String[] args) {
        // 1.创建5个学生
        Student s1 = new Student(1, "张飞", 98);
        Student s2 = new Student(2, "赵云", 88);
        Student s3 = new Student(3, "关羽", 99);
        Student s4 = new Student(4, "黄忠", 70);
        Student s5 = new Student(5, "马超", 87);
        Student s6 = new Student(1, "张飞", 98);

        // 判断两个对象是否是同一个对象（首先判断地址，若地址相同则再次判断equals)
        System.out.println(s1.hashCode());
        System.out.println(s6.hashCode());
        System.out.println(s1 == s6);  // 这里调的是toString()
        System.out.println(s1.equals(s6));

        System.out.println(s1.toString());
        System.out.println(s6.toString());

        // 面试题（重点）
        // 若hashcode一样，则equals不一定相同
        // 若equals一样，则hashcode一定一样（只有hashcode相同时才自动调用equals来判断）

//        com.lz.javacore.listdemo.Student@1
//        com.lz.javacore.listdemo.Student@1
//        false

//    public int hashCode() {
//        return 1;
//    }

        // 实现功能：内容相同的元素不能放入集合中
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        System.out.println(list); //list集合是有序且可以存放重复元素的

        // 重点：如何实现ArrayList集合去重
        // 答案：重写hashcode和equals，通过contains来实现

        //对象去重比较规则：先比较两对象的hashcode，若hashcode不一样则不是同一个对象
        // 若hashcode一样则还要去比较equals再次判断，若equals一样则是同一个对象，反之则不是

        ArrayList<Student> li = new ArrayList<>();
        for (Student stu : list) {
            if(!li.contains(stu)) { // 重写了equals和hashcode时，contains比较就会按照我们自己的规则来判断是否是同一个对象
                li.add(stu);
            }
        }
        System.out.println(li.size());

    }
}
