package com.tywh.test.interceptor;

public class SecurityInterceptor implements MyInterceptor{
    @Override
    public String intercept(MyInvocation myInvocation) {
        System.out.println("����˰�ȫ��------------------->SecurityInterceptor");
        return myInvocation.invoke();
    }
}
