package com.tywh.test.interceptor;

public class LogInterceptor implements MyInterceptor {
    @Override
    public String intercept(MyInvocation myInvocation) {
        System.out.println("记录了日志----------->LogInterceptor");
        return myInvocation.invoke();
    }
}
