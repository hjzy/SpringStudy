import cn.yifansun.pojo.User;
import cn.yifansun.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/31,17:48
 */

public class MyTest {
    @Test
    public void test(){
//        在配置文件加载的时候。其中管理的对象都已经初始化了！
        //ApplicationContext可以同时读取多个bean
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml","beansT.xml");
        //在执行getBean的时候, user已经创建好了,通过无参构造,也可以写有参构造进行赋值
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }
//    给有参构造函数赋值的方法
    @Test
    public void testT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beansT.xml");
        UserT user = (UserT) context.getBean("userT");
        user.show();
    }
}
