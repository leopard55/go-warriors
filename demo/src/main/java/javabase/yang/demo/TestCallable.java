package javabase.yang.demo;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCallable {

    public static void main(String[] args) {
        Date date = new Date();

        int taskSize = 5;
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);

    }
}
