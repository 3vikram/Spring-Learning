package com.DependencyInjection.ObjectiveDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Student sdnt = context.getBean("student", Student.class);
        sdnt.toString();
        sdnt.sData();
        sdnt.sIdentityNumber();
    }
}
