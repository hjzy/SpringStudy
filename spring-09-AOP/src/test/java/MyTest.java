import cn.yifansun.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/14,20:28
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        /**
         * 动态代理，代理的是接口,因此这里使用UserService.class
         */
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
