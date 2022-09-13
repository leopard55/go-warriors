package javabase.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Title: SortString
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2020/10/12 17:26
 * @Version: 1.0
 */

public class SortString {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return a.compareTo(b);
            }
        });
        System.out.println(names);
    }
}
