package com.itheima.mapper;

import com.itheima.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima.mapper
 *  @文件名:   UserMapper
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:42
 *  @描述：    TODO
 */

@Mapper
public interface UserMapper {

   // @Insert("insert into t_user values(null ,#{name} ,#{age})")
    void save(User user);

    void delete(User user);
    void delete2(Integer id);

    void update(User user);

    User selectOne(Integer id);

    List<User> selectAll();
}
