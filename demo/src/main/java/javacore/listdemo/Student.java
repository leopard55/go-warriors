package javacore.listdemo;

import java.util.Objects;

/**
 * @Title: Student  实体类entity
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/6/30 15:07
 * @Version: 1.0
 */
public class Student {
    private long sno;
    private String name;
    private float score;

    public Student() {
    }

    public Student(long sno, String name, float score) {
        this.sno = sno;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    // 重写hashCode()方法：JVM默认会给每个对象产生一个地址
//    @Override
//    public int hashCode() {
//        int hashCode = super.hashCode(); // 这个是JVM分配的（只要出现new肯定不一样）
//        System.out.println("对象的地址为：" + hashCode);
//        return 1;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;  // 判断两个对象的字节码文件是否是同一个
        Student student = (Student) o;
        return sno == student.sno &&
                Float.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno, name, score);
    }

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
