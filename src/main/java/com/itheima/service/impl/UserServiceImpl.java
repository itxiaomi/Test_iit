package com.itheima.service.impl;

import com.github.pagehelper.PageInfo;
import com.itheima.bean.User;
import com.itheima.mapper.UserMapper;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:35
 *  @描述：    TODO
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save() {
        System.out.println("调用UserServiceImpl的save方法~！");

        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userMapper.save(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user);
    }

    @Override
    public void delete2(Integer id) {
        userMapper.delete2(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User selectOne(Integer id) {
        return userMapper.selectOne(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public PageInfo<User> findByPage(int currentPage, int pageSize) {
        return null;
    }
}
