package javabase.yang.three;//package com.atguigu.Interview.three;
//
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import java.util.concurrent.atomic.AtomicReference;
//
//@Getter
//@ToString
////@AllArgsConstructor
//@NoArgsConstructor
//class User{
//    String userName;
//    int age;
//    User(String userName,int age){
//        this.userName = userName;
//        this.age = age;
//    }
//}
//
//public class AtomicReferenceDemo {
//    public static void main(String[] args) {
//        User z3 = new User("z3", 22);
//        User li4 = new User("li4", 25);
//
//        AtomicReference<User> atomicReference = new AtomicReference<User>();
//
//        atomicReference.set(z3);
//        System.out.println(atomicReference.compareAndSet(z3, li4)+"\t"+atomicReference.get().toString());
//        System.out.println(atomicReference.compareAndSet(z3, li4)+"\t"+atomicReference.get().toString());
//
//
//    }
//}
