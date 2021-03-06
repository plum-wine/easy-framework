//package com.github.aop;
//
//import com.github.aop.advisor.AdvisedSupport;
//import com.github.aop.proxy.JdkDynamicProxy;
//import com.github.service.HelloWorldService;
//import com.github.service.impl.HelloWorldServiceImpl;
//import com.github.service.impl.AopHelloService;
//import org.junit.Test;
//
//public class JdkDynamicAopProxyTest {
//
//    @Test
//    public void testCode() {
//        HelloWorldService helloWorldService = new AopHelloService();
//
//        // 1. 设置被代理对象(JoinPoint)
//        AdvisedSupport advisedSupport = new AdvisedSupport();
//        TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldServiceImpl.class, HelloWorldService.class);
//        advisedSupport.setTargetSource(targetSource);
//
//        // 2. 设置拦截器(Advice)
//        TimerInterceptor timerInterceptor = new TimerInterceptor();
//        advisedSupport.setMethodInterceptor(timerInterceptor);
//
//        // 3. 创建代理(Proxy)
//        JdkDynamicProxy jdkDynamicAopProxy = new JdkDynamicProxy(advisedSupport);
//        HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();
//
//        // 4. 基于AOP的调用
//        helloWorldServiceProxy.helloWorld();
//    }
//
//}
