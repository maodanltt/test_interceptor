package com.tywh.test.interceptor;

public class LogInterceptor implements MyInterceptor {
    @Override
    public String intercept(MyInvocation myInvocation) {
        System.out.println("��¼����־----------->LogInterceptor");
        return myInvocation.invoke();
    }
}
