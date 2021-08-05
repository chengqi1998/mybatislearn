package com.example.mybatislearn.controller;

import com.example.mybatislearn.mapper.UserMapper;
import com.example.mybatislearn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Usercontroller {
    @Autowired
    UserMapper userMapper;
    @GetMapping("/userlist")
    public List<User> queryList(){
        List<User> userlist=userMapper.queryList();
        for(User user: userlist)
        {
            System.out.println(user);
        }
        return userlist;
    }
    @GetMapping("/userquery/{id}")
    public User queryUser(@PathVariable("id")Integer id){
        User user=userMapper.queryUserById(id);
        System.out.println(user);
        return user;
    }
    @GetMapping("/useradd")
    public  String userAdd(){
        User user=new User(5,"d","123456");
        userMapper.addUser(user);
        return "ok";
    }
    @GetMapping("/userdelete/{id}")
    public String userDelete(@PathVariable("id")Integer id){
        System.out.println(id);
        userMapper.deleteUser(id);
        return "ok";
    }
    @GetMapping("/userupdate")
    public  String userUpdate(){
        User user=new User(1,"f","123456");
        userMapper.updateUser(user);
        return "ok";
    }
//    @GetMapping("/userUpdate")
//    public String userUpdate(){
//        User user=new User(10,"F","123456");
//        userMapper.updateUser(user);
////        List<User> userList=userMapper.queryList();
//        return  "ok";
//    }

}
