package javabase.yang.four;//package com.atguigu.Interview.four;
//
//import lombok.*;
//
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//class Person{
//    private String personName;
//    private Integer age;
//    Person(String name){
//        this.personName = name;
//    }
//}
//
//public class TestTransferValue {
//    public void changeValue1(int age){
//        age = 30;
//    }
//    public void changeValue2(Person person){
//        person.setPersonName("xxx");
//    }
//    public void changeValue3(String str){
//        str = "xxx";
//    }
//
//    public static void main(String[] args) {
//        TestTransferValue test = new TestTransferValue();
//        int age = 20;  //在栈里面 ，栈管运行，堆管存储
//        test.changeValue1(age);
//        System.out.println("age---"+age);
//
//        Person person = new Person("abc");
//        test.changeValue2(person);
//        System.out.println("psersonName---"+person.getPersonName());
//
//        //字符串常量池
//        String str = "abc";
//        test.changeValue3(str);
//        System.out.println("String---"+str);
//
//    }
//}
