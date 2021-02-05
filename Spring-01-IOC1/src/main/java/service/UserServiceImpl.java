package service;

import dao.UserDao;
import dao.UserDaoImpl;

/**
 * @author:yifan->2540584259@qq.com
 * @date:2021/1/30,21:56
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
