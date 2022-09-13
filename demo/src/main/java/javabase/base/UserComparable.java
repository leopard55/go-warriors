package javabase.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserComparable implements Comparable<UserComparable>
{
    private String name;
    private int age;
    public UserComparable(String name, int age) {
        this.name = name;
        this.age = age;
}
    @Override
    public String toString() {
        return "UserComparable{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    @Override
    public int compareTo(UserComparable o) {
        if (this.name.compareTo(o.name) == 0){
            if (this.age == o.age){
                return 0;
            }else if (this.age >o.age){
                return 1;
            }else {
                return -1;
            }
        }else if (this.name.compareTo(o.name)>0){
            return 1;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        List<UserComparable> list = new ArrayList<UserComparable>();
        list.add(new UserComparable("gol",21));
        list.add(new UserComparable("gol",19));
        list.add(new UserComparable("xiao",21));
        list.add(new UserComparable("long",21));
        System.out.println("排序前："+list);
        Collections.sort(list);
        System.out.println("排序后："+list);
    }
}






