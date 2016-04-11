package com.proxy.dync;

import com.proxy.statics.HelloService;
import com.proxy.statics.HelloServiceImpl;
import com.proxy.statics.HelloWithoutInterface;
import org.junit.Test;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class TestDyncProxy {

    @Test
    public void testDyncProxy(){
        HelloService helloService = DyncHelloProxyFactory.getHelloProxy(new HelloServiceImpl());
        helloService.echo("Hello Dync Proxy");
        helloService.getTime();
    }

    //THIS TEST WILL THROW EXCEPTION "java.lang.IllegalArgumentException: com.proxy.statics.HelloWithoutInterface is not an interface"
    @Test
    public void testDyncWithoutInterfaceProxy(){
        HelloWithoutInterface helloWithoutInterface = DyncHelloWithoutInterfaceProxyFactory.getProxy(new HelloWithoutInterface());
        helloWithoutInterface.echo("Hello without interface jdk proxy");
    }
}
