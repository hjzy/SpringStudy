package cn.yifansun.mapper;

import cn.yifansun.pojo.User;

import java.util.List;

public interface UserMapper {
    public  User getUserById(int id);

    public int addUser(User user);

    public int deleteUser(int id);
}
