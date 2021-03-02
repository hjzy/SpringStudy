package cn.yifansun.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这个类为一个切面
public class AnnotationPointCut {
    @Before("execution(* cn.yifansun.service.UserServiceImpl.*(..))")
    //execution 切入点
    public void before() {
        System.out.println(">>>>>方法执行前<<<<<<");
    }

    @After("execution(* cn.yifansun.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println(">>>>>方法执行后<<<<<<");
    }

    /**
     * 在环绕增强中,我们可以给定一个参数,代表我们要获取处理切入的点
     * 执行顺序:环绕前 => 方法执行前 => 环绕后 => 方法执行后
     */
    @Around("execution(* cn.yifansun.service.UserServiceImpl.*(..))")
    public void around(@org.jetbrains.annotations.NotNull ProceedingJoinPoint jp) throws Throwable {
        System.out.println(">>>>>环绕前<<<<<<");

        /*
        * 可以通过ProceedingJoinPoint获取方法的信息
        *public interface JoinPoint {
           String toString();         //连接点所在位置的相关信息
           String toShortString();     //连接点所在位置的简短相关信息
           String toLongString();     //连接点所在位置的全部相关信息
           Object getThis();         //返回AOP代理对象，也就是com.sun.proxy.$Proxy18
           Object getTarget();       //返回目标对象，一般我们都需要它或者（也就是定义方法的接口或类，为什么会是接口呢？这主要是在目标对象本身是动态代理的情况下，例如Mapper。所以返回的是定义方法的对象如aoptest.daoimpl.GoodDaoImpl或com.b.base.BaseMapper<T, E, PK>）
           Object[] getArgs();       //返回被通知方法参数列表
           Signature getSignature();  //返回当前连接点签名  其getName()方法返回方法的FQN，如void aoptest.dao.GoodDao.delete()或com.b.base.BaseMapper.insert(T)(需要注意的是，很多时候我们定义了子类继承父类的时候，我们希望拿到基于子类的FQN，这直接可拿不到，要依赖于AopUtils.getTargetClass(point.getTarget())获取原始代理对象，下面会详细讲解)
           SourceLocation getSourceLocation();//返回连接点方法所在类文件中的位置
           String getKind();        //连接点类型
           StaticPart getStaticPart(); //返回连接点静态部分
          }
        * */

        //通过ProceedingJoinPoint获得签名
        Signature signature = jp.getSignature();
        System.out.println("signature:" + signature);

        //执行方法
        Object proceed = jp.proceed();

        System.out.println(">>>>>环绕后<<<<<<");
        //System.out.println(proceed);
    }
}
