package cn.yifansun.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/5,17:59
 */
@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
//@Component是组件的意思
public class User {
//    显式注入
//    public String name = "秦疆";

    //    注解注入
//    相当于配置文件中 <property name="name" value="yifan"/>
//    也可以放到该属性的set方法上
    @Value("yifan")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}