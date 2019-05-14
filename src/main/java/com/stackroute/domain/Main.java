package com.stackroute.domain;

import com.stackroute.domain.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie beanA=(Movie) context.getBean("MovieA");
        Movie beanB=(Movie) context.getBean("MovieA");
        beanA.movieOut();

        System.out.println(beanA==beanB);


    }
}
