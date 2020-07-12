package com.excer.test;

import com.excer.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 在每个测试之前调用的方法用@Before注解
     * 一般用于一些资源的申请什么的
     */
    @Before
    public void init() {
        System.out.println("测试开始啦");
    }

    /**
     * 在每个测试完成之后使用@After
     * 一般用与资源的释放什么的 ...
     */
    @After
    public void close() {
        System.out.println("测试结束");
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int add = calculator.add(3, 4);
        Assert.assertEquals(7, add);
        System.out.println("3+4 = 7");
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int sub = calculator.sub(5, 1);
        Assert.assertEquals(4, sub);
        System.out.println("5-1 = 4");
    }
}
