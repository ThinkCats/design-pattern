package com.proxy.statics;

import java.util.Date;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class HelloProxy implements HelloService {

    private HelloService helloService ;

    public HelloProxy(HelloService helloService) {
        this.helloService = helloService;
    }


    public void echo(String msg) {
        System.out.println("Before call  echo ...");
        helloService.echo(msg);
        System.out.println("End call echo....");
    }


    public Date getTime() {
        System.out.println("Before calling get time ...");
        Date date = helloService.getTime();
        System.out.println("Get data:" + date);
        System.out.println("End  calling get time ...");
        return date;
    }
}
