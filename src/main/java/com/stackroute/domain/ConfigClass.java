package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

//this is configuration class
@Configuration
public class ConfigClass
{

    //creating bean for actor class
   @Bean
    public Actor getActor()
    {
        Actor actor = new Actor();
        actor.setName("sharukh");
        actor.setAge(50);
        actor.setGender("male");
      return actor;
    }


    //creating bean for movie class
    @Bean
    public Movie getMovie()
    {
        return new Movie();

    }


}
