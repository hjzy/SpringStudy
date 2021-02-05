import cn.yifansun.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/30,21:35
 */
public class MyTest {
    @Test
    public static void main(String[] args) {
//        获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        我们的对象现在都在Spring的配置文件（beans.xml）中管理了，使用的话从里面取即可。
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
