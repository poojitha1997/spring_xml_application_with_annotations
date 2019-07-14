package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Arrays;
import java.util.List;

//this is configuration class
@Configuration
public class ConfigClass
{

@Bean
public BeanLifeCycleDemoBean getBean()
{
    BeanLifeCycleDemoBean beanLifeCycleDemoBean = new BeanLifeCycleDemoBean();
    beanLifeCycleDemoBean.setName("poojitha");
    return beanLifeCycleDemoBean;
}
@Bean
public BeanPostProcessorDemoBean getbeanpostprocessordemobean()
{
    BeanPostProcessorDemoBean beanPostProcessorDemoBean = new BeanPostProcessorDemoBean();
    return  beanPostProcessorDemoBean;

}


}
