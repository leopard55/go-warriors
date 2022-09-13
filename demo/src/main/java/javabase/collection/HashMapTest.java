package javabase.collection;

import java.util.*;

/**
 * @Author:         lz
 * @CreateDate:     2019-07-07 00:54
 *
 * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。
 * 请写一个方法实现对 HashMap 的排序功能，
 * 该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
 * 要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
 *
 * 注意 ：要做出这道题必须对集合的体系结构非常的熟悉。 HashMap 本身就是不可排序的，
 * 但是该道题偏偏让给 HashMap 排序，那我们就得想在 API 中有没有这样的 Map 结构是有序的，
 * LinkedHashMap，对的，就是他，他是 Map 结构，也是链表结构，有序的，更可喜的是他是 HashMap 的子类，
 * 我们返回 LinkedHashMap<Integer,User>
 */

class User{

    private String name ;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashMapTest {

    public static void main(String[] args) {

//      ArrayList<String> strings = new ArrayList<>();
//      strings.add("a");
//      strings.get(2);

        HashMap<Integer, User> users = new HashMap<>();

        users.put(1, new User(" 张三 ", 25));
        users.put(3, new User(" 李四 ", 22));
        users.put(2, new User(" 王五 ", 28));

        System.out.println(users);

        HashMap<Integer, User> sortHashMap = sortHashMap(users);

        System.out.println(sortHashMap);
    }


    public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {

        //首先拿到 map的键值对集合
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();

        //将set集合转为 List集合，为什么，为了使用工具类的排序方法
        List<Map.Entry<Integer, User>> list = new ArrayList<>(entrySet);

        // 使用 Collections集合工具类对 list进行排序，排序规则使用匿名内部类来实现
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {

            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                // User的age的倒序进行排
                return o1.getValue().getAge() - o2.getValue().getAge();
            }
        });

//        Collections.sort(list, (Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2)-> {
//            return o1.getValue().getAge() - o2.getValue().getAge();
//        });

        // HashMap子类的集合
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<Integer, User>();

        // List 中的数据存储在 LinkedHashMap 中
        for(Map.Entry<Integer, User> entry : list){

            linkedHashMap.put(entry.getKey(), entry.getValue());

        }

        return linkedHashMap;
    }
}
