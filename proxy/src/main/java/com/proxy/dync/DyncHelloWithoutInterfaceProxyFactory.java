package com.proxy.dync;

import com.proxy.statics.HelloWithoutInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class DyncHelloWithoutInterfaceProxyFactory {

    public static HelloWithoutInterface getProxy(final HelloWithoutInterface helloWithoutInterface){
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Begin call without interface method "+ method.getName());
                Object result = method.invoke(helloWithoutInterface,args);
                System.out.println("End call without interface method "+ method.getName());
                return result;
            }
        };
        Class classType = HelloWithoutInterface.class;
        return (HelloWithoutInterface) Proxy.newProxyInstance(classType.getClassLoader(),new Class[]{classType},handler);
    }

}
