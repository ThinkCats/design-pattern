package com.proxy.dync;

import com.proxy.statics.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class DyncHelloProxyFactory {
    public static HelloService getHelloProxy(final HelloService helloService) {
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Begin Call " + method.getName());
                Object result = method.invoke(helloService, args);
                System.out.println("End Call " + method.getName());
                return result;
            }
        };
        Class classType = HelloService.class;
        return (HelloService) Proxy.newProxyInstance(classType.getClassLoader(), new Class[]{classType}, handler);
    }
}
