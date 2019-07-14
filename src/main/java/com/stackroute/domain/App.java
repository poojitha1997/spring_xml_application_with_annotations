package com.stackroute.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Movie movie =context.getBean( Movie.class);
        //displaying the values of the actor
        movie.display();
    }
}
