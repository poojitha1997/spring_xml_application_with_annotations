package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        BeanLifeCycleDemoBean bean =context.getBean( BeanLifeCycleDemoBean.class);
        //displaying the values of the actor
        System.out.println(bean.getName());

        context.close();
    }
}
