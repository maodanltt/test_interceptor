package com.tywh.test.interceptor;

public class SecurityInterceptor implements MyInterceptor{
    @Override
    public String intercept(MyInvocation myInvocation) {
        System.out.println("检查了安全性------------------->SecurityInterceptor");
        return myInvocation.invoke();
    }
}
