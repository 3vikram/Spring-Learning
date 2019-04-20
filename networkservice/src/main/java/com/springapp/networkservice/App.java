package com.springapp.networkservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        SimCard sim = context.getBean("anything", SimCard.class);
        sim.calling();
        sim.internet();
    }
}
