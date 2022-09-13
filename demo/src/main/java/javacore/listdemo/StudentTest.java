package javacore.listdemo;

import java.util.ArrayList;

/**
 * @Title: StudentTest
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/6/30 15:09
 * @Version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 1.创建5个学生
        Student s1 = new Student(1, "张飞", 98);
        Student s2 = new Student(2, "赵云", 88);
        Student s3 = new Student(3, "关羽", 99);
        Student s4 = new Student(4, "黄忠", 70);
        Student s5 = new Student(5, "马超", 87);
        Student s6 = new Student(1, "张飞", 98);
        // 2.创建一个班级集合
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        // 1.对象的遍历foreach
        for (Student stu : list) { // 其中的s是一个局部变量，每次用来接收返回的遍历对象
            System.out.println(stu);
        }

        // 2.通过成绩升序排序
        System.out.println("-------------");
        bubbleSort(list);
        for (Student stu : list) {
            System.out.println(stu);
        }

        // 3.通过equals来判断对象，若所有属性数据都相同则表示同一个对象
        System.out.println(s1.equals(s6));
    }

    private static void bubbleSort(ArrayList<Student> list) {
        for (int i = 0; i < list.size() - 1; i++) { // 外层控制的是总的比较轮数
            for (int j = 0; j < list.size() - 1 - i; j++) { // 实现两个对象的比较
                if(list.get(j).getScore() < list.get(j+1).getScore()) { // 比较两对象间的分数
                    // 在集合中需要交换的是两个学生对象的元素
                    Student temp = list.get(j);
                    list.set(j, list.get(j+1)); // list.set(index, value) 更新索引处值
                    list.set(j+1, temp);
                }
            }
        }
    }
}
