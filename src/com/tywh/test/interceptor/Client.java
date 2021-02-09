package com.tywh.test.interceptor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        MyInvocation myInvocation = new MyInvocation();
        MyInterceptor logInterceptor = new LogInterceptor();
        MyInterceptor securityInterceptor = new SecurityInterceptor();
        List<MyInterceptor> interceptorList = new ArrayList<>();
        interceptorList.add(logInterceptor);
        interceptorList.add(securityInterceptor);
        Iterator<MyInterceptor> iterator =  interceptorList.iterator();
        myInvocation.setMyInterceptors(iterator);
        myInvocation.invoke();
    }
}
