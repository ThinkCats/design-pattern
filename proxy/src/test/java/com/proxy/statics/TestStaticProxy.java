package com.proxy.statics;

import org.junit.Test;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class TestStaticProxy {
    @Test
    public void testStaticProxy(){
        HelloService helloService = new HelloServiceImpl();
        HelloProxy proxy = new HelloProxy(helloService);
        proxy.echo("hello world");
        System.out.println("Final Data :"+ proxy.getTime());
    }
}
