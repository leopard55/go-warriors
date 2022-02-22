package com.leopard.dpgof.a_singleresponsibility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-02-22 14:12
 */
public class negative {
    public static void main(String[] args) throws Exception {
        //Reader in = new FileReader("D:\\javaworkspace\\go-warriors\\dp-gof\\src\\main\\resources\\1.txt");
        Reader in = new FileReader("./dp-gof/src/main/resources/1.txt");
        BufferedReader br = new BufferedReader(in);

        String line = null;

        StringBuilder sb = new StringBuilder("");

        while((line = br.readLine()) != null){
            sb.append(line);
            sb.append(" ");
        }

        String[] words = sb.toString().split("[^a-zA-Z]+");

        for (String word : words) {
            System.out.println(word + "~~~");
        }

        System.out.println(words.length);

        br.close();
    }
}
