package com.leopard.dpgof.a_singleresponsibility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @Descriptoin: TODO
 * @Author: leopard
 * @CreateDate: 2022-02-22 14:45
 */
public class positive {
    //==============只负责根据路径加载文件
    public static String loadFile(String path) throws IOException {
        Reader in = new FileReader(path);
        BufferedReader br = new BufferedReader(in);
        String line = null;
        StringBuilder sb = new StringBuilder("");
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("");
        }
        br.close();
        return sb.toString();
    }
    //=========只负责字符串根据正则分割
    public static int Textlength(String sb, String regex){
        String [] words = sb.split(regex);
        return  words.length;
    }
    public static void main(String[] args) throws IOException {
        String str = loadFile("./dp-gof/src/main/resources/1.txt");
        String regex ="[^a-zA-Z]+";
        System.out.println(Textlength(str,regex));
    }
}
