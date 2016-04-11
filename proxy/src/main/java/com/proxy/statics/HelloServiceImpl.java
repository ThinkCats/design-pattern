package com.proxy.statics;

import java.util.Date;

/**
 * Created by wanglei25 on 2016/4/11.
 */
public class HelloServiceImpl implements HelloService {

    public void echo(String msg) {
        System.out.println("Echo " + msg);
    }


    public Date getTime() {
        return new Date();
    }
}
