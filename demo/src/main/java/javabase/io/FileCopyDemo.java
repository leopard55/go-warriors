package javabase.io;

import java.io.*;

/**
 * @Title: FileCopyDemo
 * @Description: 利用字符流将当前工程下的IODemo拷贝到d:\IODemo.java下
 * @Author: lz
 * @CreateDate: 2019/8/12 11:02
 * @Version: 1.0
 */
public class FileCopyDemo {
    public static void main(String[] args) throws Exception {
//        fileReaderWriter();
        bufferedReaderWriter();
    }

    private static void fileReaderWriter() throws IOException {
        FileReader fr = new FileReader("src/main/java/io/IODemo.java");
        FileWriter fw = new FileWriter("d:/IODemo.java");   // '/'或者'\\'
//        int ch;
//        while((ch = fr.read()) != -1){
//            fw.write(ch);
//            fw.flush();
//        }

        int len;
        char[] chs = new char[1024];
        while((len = fr.read(chs)) != -1){
            fw.write(chs, 0, len);
            fw.flush();
        }

        fw.close();
        fr.close();
    }


    public static void bufferedReaderWriter() throws IOException{
        //创建一个读取流对象和文件相关联。
        FileReader fr = new FileReader("src/main/java/io/IODemo.java");
        //为了提高效率。加入缓冲技术。将字符读取流对象作为参数传递给缓冲对象的构造函数。
        BufferedReader bufr = new BufferedReader(fr);

        //创建一个字符写入流对象。
        FileWriter fw = new FileWriter("d:/IODemo.java");

        //为了提高字符写入流效率。加入了缓冲技术。
        BufferedWriter bufw = new BufferedWriter(fw);

        String line = null;

        while((line=bufr.readLine())!=null)
        {
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }

        bufr.close();
        //其实关闭缓冲区，就是在关闭缓冲区中的流对象。
        bufw.close();
    }
}
