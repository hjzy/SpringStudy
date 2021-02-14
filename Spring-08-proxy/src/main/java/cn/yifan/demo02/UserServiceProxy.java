package cn.yifan.demo02;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/2/14,17:13
 */
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    /**
     * 日志方法
     */
    public void log(String msg){
        System.out.println("[debug] 使用了" + msg + "方法！");
    }
}
