package com.stackroute.domain;

import com.stackroute.domain.beans.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1= (Movie) context.getBean("Movie1");
       // Movie movie2= (Movie) context.getBean("Movie2");
        //System.out.println(movie1);
        //System.out.println(movie2);
        System.out.println(movie1.toString());
    }
}
