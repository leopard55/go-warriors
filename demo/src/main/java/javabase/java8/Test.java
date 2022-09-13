package javabase.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Title: Test
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/7/19 10:34
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        Collections.sort(strings, (String a,String b) -> {
                    return b.compareTo(a);
                }

        );

        Collections.sort(strings, (String a, String b) -> b.compareTo(a));

        Collections.sort(strings, Comparator.reverseOrder());

        System.out.println(strings);
    }
}
