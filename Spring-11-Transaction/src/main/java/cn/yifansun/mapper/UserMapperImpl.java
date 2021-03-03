package cn.yifansun.mapper;

import cn.yifansun.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

public class UserMapperImpl implements UserMapper {
    /**
     * 在原来，我们的所有操作，都是以sqlSession来执行。现在都是使用SqlSessionTemplate
     * SqlSessionTemplate是sqlSession的一个实现，使用时可以看作一个东西
     */
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public User getUserById(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.getUserById(id);
    }
    public int addUser(User user) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.addUser(user);
    }

    public int deleteUser(int id) {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }

}
