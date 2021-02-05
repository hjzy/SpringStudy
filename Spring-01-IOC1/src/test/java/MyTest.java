import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserServiceImpl;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/30,22:04
 */
public class MyTest {
    public static void main(String[] args) {
//        获取ApplicationContext：拿到Spring的容器
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        //容器在手，需要什么就直接get什么
        UserServiceImpl userService =(UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();
    }
}
