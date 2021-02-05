package dao;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/30,21:51
 */
public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySql获取用户数据");
    }
}
