package com.stackroute.domain.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycle implements InitializingBean, DisposableBean
{
    public void customInit()
    {
        System.out.println("Inside customInit");
    }


    public void destroy() throws Exception {
        System.out.println("In destroy method");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet");
    }

    public void customDestroy() throws Exception
    {
        System.out.println("In custom Destroy");
    }
}
