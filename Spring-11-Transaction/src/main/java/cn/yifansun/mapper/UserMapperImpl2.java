package cn.yifansun.mapper;

import cn.yifansun.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{



    @Override
    public User getUserById(int id) {
//        return getSqlSession().getMapper(UserMapper.class).getUserById(id);

        User user =new User(5,"asd","asd");

        UserMapper mapper= getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(5);
        return mapper.getUserById(5);
    }
    @Override
    public int addUser(User user){
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }
    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}