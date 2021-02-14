import cn.yifansun.config.MyConfig;
import cn.yifansun.pojo.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/5,18:57
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Dog dog = applicationContext.getBean("dog",Dog.class);
        System.out.println(dog.name);
    }




}
