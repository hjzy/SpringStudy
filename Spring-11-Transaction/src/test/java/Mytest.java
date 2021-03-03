import cn.yifansun.mapper.UserMapper;
import cn.yifansun.pojo.User;
import org.apache.log4j.Logger;
import org.junit.Test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    //    使用log4j时必须创建logger对象
    static Logger logger = Logger.getLogger(Mytest.class);

    @Test
    public void getUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //底层主要应用反射
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
//        User user = userMapper.getUserById(1);
//        System.out.println(user);
        User user = userMapper.getUserById(4);
    }
}
