package com.leopard.dpgof.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

/**
 * @Title: Test
 * @Description: 单一职责，找出两个文件中相同的单词
 * @Author: lz
 * @CreateDate: 2020/12/11 9:44
 * @Version: 1.0
 */
public class AppTest0 {
    public static void main(String[] args) throws Exception {
        String str1 = loadFile("./dp-gof/src/main/resources/1.txt");
        String str2 = loadFile("./dp-gof/src/main/resources/2.txt");

        String[] words1 = parseWordFromString(str1);
        String[] words2 = parseWordFromString(str2);

        String[] sameElement = getSameElement2(words1, words2);

        for (String elt : sameElement) {
            System.out.println(elt);
        }

        System.out.println(Arrays.toString(sameElement));
    }

    private static void test() {
        String[] strs = "a b c".split(" ");
        List<String> list = Arrays.asList(strs); //只读集合

        //java.lang.UnsupportedOperationException
        //list.add("d");
        //list.remove(0);

        List<String> list1 = new ArrayList(Arrays.asList(strs));
        list1.add("d");

        System.out.println(list1);
    }

    private static String[] getSameElement2(String[] words1, String[] words2) {
        List<String> list1 = new ArrayList<>(Arrays.asList(words1));
        List<String> list2 = new ArrayList<>(Arrays.asList(words2));

        //计算交集，并且把计算结果放入list1中，list2不会变
        list1.retainAll(list2);

        Set<String> set = new HashSet<>(list1);

        return set.toArray(new String[]{});
    }

    private static String[] getSameElement(String[] words1, String[] words2) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words1.length; i++) {
            for (int j = 0; j < words2.length; j++) {
                if (words1[i].equals(words2[j])) {
                    set.add(words1[i]);
                }
            }
        }
        //[Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
        //String[] strings = (String[]) set.toArray();
        return set.toArray(new String[]{});
    }

    private static String[] parseWordFromString(String str) {
        String[] words = str.split("[^a-zA-Z]+");
        return words;
    }

    private static String loadFile(String path) throws IOException {
        Reader in = new FileReader(path);
        BufferedReader br = new BufferedReader(in);

        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null){
            sb.append(line);
            sb.append("\n");
        }
        br.close();
        return sb.toString();
    }
}
