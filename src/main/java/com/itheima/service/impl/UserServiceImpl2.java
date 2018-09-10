package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.bean.User;
import com.itheima.mapper.UserMapper2;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima.service.impl
 *  @文件名:   UserServiceImpl
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:35
 *  @描述：    TODO
 */

@Service("u2")
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserMapper2 userMapper2;

    @Override
    public void save() {
        System.out.println("调用UserServiceImpl的save方法~！");

        User user = new User();
        user.setName("张三");
        user.setAge(18);
        userMapper2.insert(user);
    }

    @Override
    public void delete(User user) {
        userMapper2.delete(user);
    }

    @Override
    public void delete2(Integer id) {
        userMapper2.deleteByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
        userMapper2.updateByPrimaryKey(user);
    }

    @Override
    public User selectOne(Integer id) {
        return userMapper2.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper2.select(null);
    }

    @Override
    public PageInfo<User> findByPage(int currentPage, int pageSize) {


        PageHelper.startPage(currentPage , pageSize);

        List<User> list = userMapper2.select(null);

        System.out.println("list=" + list);

        PageInfo<User> pageInfo = new PageInfo<>(list);


      //  pageInfo.setList(list);
        return pageInfo;
    }
}
