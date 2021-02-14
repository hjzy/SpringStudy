package cn.yifansun.config;

import cn.yifansun.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/5,18:52
 */
//代表这是一个配置类
@Configuration
//设置扫描路径
@ComponentScan("cn.yifansun")
@Import(MyConfig2.class)
public class MyConfig {
    @Bean
    //通过方法注册一个bean，这里的返回值就是Bean的类型，方法名就是bean的id！
    public Dog dog() {
        return new Dog();
    }
}
