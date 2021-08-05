package com.example.mybatislearn.mapper;

import com.example.mybatislearn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//标识一个mapper类
@Mapper
@Repository
//@Component
public interface UserMapper {
    List<User> queryList();
    User queryUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}
