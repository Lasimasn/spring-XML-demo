package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        //        Using Xml BeanFactory

//        Resource resource=new ClassPathResource("beans.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(resource);
//        Movie movie=(Movie) beanFactory.getBean("parentMovie");
//        movie.movieOut();

        //        Using BeanDefinitionReader

//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie=(Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("parentMovie");
//        movie.movieOut();

        //        Using Application Context
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=(Movie) context.getBean("parentMovie");
        movie.movieOut();

    }
}
