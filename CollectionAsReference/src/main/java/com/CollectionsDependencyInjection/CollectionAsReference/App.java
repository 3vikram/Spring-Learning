package com.CollectionsDependencyInjection.CollectionAsReference;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("CollectionBean.xml");
        Question quest = context.getBean("q", Question.class);
        quest.displayInfo();
    }
}
