package cn.yifansun.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/14,20:17
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * @param returnValue
     * @param method
     * @param objects
     * @param target
     * @return void
     * @date 2021/2/14 20:17
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为"+returnValue);
    }
}
