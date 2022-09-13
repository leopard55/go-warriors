package javabase.io;

import java.io.*;

/**
 * @Title: FileCopyStreamDemo
 * @Description: 利用字节流将当前工程下的IODemo拷贝到d:\IODemo.java下
 * @Author: lz
 * @CreateDate: 2019/8/12 11:16
 * @Version: 1.0
 */
public class FileCopyStreamDemo {
    public static void main(String[] args) throws IOException{
//        fileInputStreamOuputStream();


        bufferedInputStreamOutStream();
    }

    private static void bufferedInputStreamOutStream() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\io\\IODemo.java");
        FileOutputStream fos = new FileOutputStream("d:\\IODemo.java");

        BufferedInputStream buis = new BufferedInputStream(fis);
        BufferedOutputStream buos = new BufferedOutputStream(fos);

        int len;
        byte[] bys = new byte[1024];
        while((len = buis.read(bys)) != -1)
        {
            buos.write(bys);
            buos.flush();
        }

        buis.close();
        buos.close();
    }

    private static void fileInputStreamOuputStream() throws IOException {
        FileInputStream fis = new FileInputStream("src\\main\\java\\io\\IODemo.java");
        FileOutputStream fos = new FileOutputStream("d:\\IODemo.java");
//        int by;
//        while((by = fis.read()) != -1){
//            fos.write(by);
//        }

        int len;
        byte[] bys = new byte[1024];
        while((len = fis.read(bys)) != -1){
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();
    }
}
