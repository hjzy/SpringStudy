package cn.yifan.demo02;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/14,17:11
 */
public class UserServiceImpl implements UserService {

    public void add() {
        System.out.println("增加了一个用户！");
    }

    public void delete() {
        System.out.println("删除了一个用户！");
    }

    public void update() {
        System.out.println("修改了一个用户！");
    }

    public void query() {
        System.out.println("查询一个用户！");
    }

    /**
     * 1、改动原有的业务代码，在公司中是大忌！
     * 2、
     */
}