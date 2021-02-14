package cn.yifan.demo02;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/14,17:14
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.update();
    }
}
