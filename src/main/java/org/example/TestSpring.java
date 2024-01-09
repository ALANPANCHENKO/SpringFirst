package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        TestONE testONE = context.getBean("testONE", TestONE.class);

        System.out.println(testONE.getName());

        context.close();
    }
}
