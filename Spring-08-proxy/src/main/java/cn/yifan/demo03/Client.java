package cn.yifan.demo03;

import cn.yifan.demo02.UserService;
import cn.yifan.demo02.UserServiceImpl;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/14,16:59
 */
public class Client {
    public static void main(String[] args) {
        //这是真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
