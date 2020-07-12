package com.excer.reflect;

import com.excer.domain.Person;

/**
 * 反射的三种方式获得对象
 * Class.forName(全类名) 一般用于配置文件
 * 类.class 一般用于传参
 * 对象.getClass 一般用于获取类的字节码
 */
public class ReflectDemo01 {

    public static void main(String[] args) throws Exception {
        // 1. Class.forName 获取Person 类
        Class cls01 = Class.forName("com.excer.domain.Person");
        // 2. 类.class
        Class cls02 = Person.class;
        // 3. 对象.getClass
        Class cls03 = new Person().getClass();

        System.out.println(cls01);
        System.out.println(cls02);
        System.out.println(cls03);

        System.out.println("cls01==cls02 ==>" + (cls01 == cls02)); // true
        System.out.println("cls01==cls03 ==>" + (cls01 == cls03)); // true
        // 以上两个true 代表程序在加载的时候只加载一次字节码到内存中
    }
}
