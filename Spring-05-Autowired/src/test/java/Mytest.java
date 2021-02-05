import cn.yifansun.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/2,21:39
 */
public class Mytest {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        People people =context.getBean("people",People.class);
        people.getCat().shout();
        people.getDog().shout();

    }


}
