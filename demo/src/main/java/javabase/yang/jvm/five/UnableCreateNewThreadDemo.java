package javabase.yang.jvm.five;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 19:20
*/

public class UnableCreateNewThreadDemo {
    public static void main(String[] args) {
        for (int i = 1; ; i++) {
            System.out.println("******* i = " + i);
            new Thread(() -> {
                try{
                    Thread.sleep(Integer.MAX_VALUE);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            },""+i).start();
        }
    }
}
