package com.itheima.bean;

import javax.persistence.Id;
import javax.persistence.Table;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima.bean
 *  @文件名:   User
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:42
 *  @描述：    TODO
 */
@Table(name="t_user")
public class User {

    @Id
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
