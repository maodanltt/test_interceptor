package com.tywh.test.interceptor;

import java.util.Iterator;

public class MyInvocation {


    private String resultCode;
    private Iterator<MyInterceptor> myInterceptors;

    public void setMyInterceptors(Iterator<MyInterceptor> myInterceptors) {
        this.myInterceptors = myInterceptors;
    }

    String invoke() {
        String testString1 = "testString1";
        if (myInterceptors.hasNext()) {
            String testString2 = "testString2";
            resultCode = myInterceptors.next().intercept(MyInvocation.this);
            String testString3 = "testString3";
        } else {
            resultCode = MyResult.resultString();
        }
        return resultCode;
    }
}
