import cn.yifansun.pojo.Student;
import cn.yifansun.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/2,11:50
 */
public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student.toString());
//        Student{
//        name='yifan',
//        address=Address{address='anhui'},
//
//        books=[
//        红楼梦,
//        西游记,
//        三国演义,
//        水浒传],
//
//        hobbys=[
//        听歌,
//        敲代码,
//        看电影],
//
//        card={
//        身份证=121223123,
//        银行卡=122456466},
//
//        games=[
//        LOL,
//        COC,
//        DOD],
//
//        wife='null',
//
//        info={
//        driver=jdbc,
//        url=.....,
//        username=yifan}}


    }
    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("userbeans.xml");
        User user= applicationContext.getBean("user2", User.class);
        User user2= applicationContext.getBean("user2", User.class);
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());

    }
}
