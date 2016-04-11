package com.proxy.cglib;

import com.proxy.statics.HelloServiceImpl;
import org.junit.Test;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class TestCglibProxy {

    @Test
    public void testCglibProxy(){
        CglibProxy proxy = new CglibProxy();
        HelloServiceImpl helloServiceImpl = (HelloServiceImpl) proxy.getProxy(HelloServiceImpl.class);
        helloServiceImpl.echo("Hello Cglib Proxy");
    }
}
