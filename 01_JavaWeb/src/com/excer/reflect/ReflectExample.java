package com.excer.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 要求 这边可以根据配置创建任意对象并执行方法
 */
public class ReflectExample {
    public static void main(String[] args) throws Exception {
        // 1. 首先在src下建立一个pro.properties 配置文件文件
        // 2. 创建读取配置的操作对象
        final Properties properties = new Properties();
        // 3. 用当前的类加载器寻找配置文件;
        final ClassLoader classLoader = ReflectExample.class.getClassLoader();
        final InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        // 4 加载属性
        properties.load(resourceAsStream);
        // 5. 获取配置文件的类的字节码
        final String className = properties.getProperty("className");
        final Class aClass = Class.forName(className);
        // 6 创建该对象
        Object obj = aClass.newInstance();
        // 7 获取要执行的方法
        final String methodName = properties.getProperty("methodName");
        // 8 获取类中的方法
        final Method method = aClass.getMethod(methodName);
        // 9 执行该对象中的相应的方法
        method.invoke(obj);

    }
}
