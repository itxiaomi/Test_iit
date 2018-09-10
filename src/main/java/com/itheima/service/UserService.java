package com.itheima.service;

import com.github.pagehelper.PageInfo;
import com.itheima.bean.User;

import java.util.List;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima.service
 *  @文件名:   UserService
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:34
 *  @描述：    TODO
 */
public interface UserService {

    void  save();

    void delete(User user);
    void delete2(Integer id);

    void update(User user);

    User selectOne(Integer id);

    List<User> selectAll();


    PageInfo<User> findByPage(int currentPage, int pageSize);
}
