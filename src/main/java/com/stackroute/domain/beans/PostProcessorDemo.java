package com.stackroute.domain.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class PostProcessorDemo implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In postProcessorBefore initialisation of:"+beanName);
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In postProcessorAfter initialization of:"+beanName);
        return bean;
    }
}
