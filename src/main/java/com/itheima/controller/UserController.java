package com.itheima.controller;

/*
 *  @项目名：  ssm 
 *  @包名：    com.itheima.controller
 *  @文件名:   UserController
 *  @创建者:   xiaomi
 *  @创建时间:  2018/9/4 14:30
 *  @描述：    TODO
 */

import com.github.pagehelper.PageInfo;
import com.itheima.bean.User;
import com.itheima.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//@Controller  //表示方法返回的是页面跳转的名称  路径

@RestController //= @Controller + @ResponseBody (表示所有的方法返回的是json字符串)
public class UserController {


    //@Autowired
    @Resource(name="u2")
    private UserService userService;


    //默认情况下 SpringBoot 指定的项目名 /
    @RequestMapping("save")
    public String save(){

        System.out.println("调用了UserController的save方法~！~");

        userService.save();

        return "save success~!~";
    }


    @RequestMapping("delete")
    public String delete(){

        System.out.println("调用了UserController的delete方法~！~");

       // User user = new User();
        //user.setId(3);
        userService.delete2(4);

        return "delete success~!~";
    }

    @RequestMapping("update")
    public String update(){

        System.out.println("调用了UserController的update方法~！~");

        User user = new User();
        user.setId(5);
        user.setAge(99);
        userService.update(user);

        return "delete success~!~";
    }

    @RequestMapping("selectOne")
    public String selectOne(){

        System.out.println("调用了UserController的update方法~！~");

       User user =  userService.selectOne(5);

        System.out.println("user=" + user);

        return "delete success~!~";
    }

    @RequestMapping("selectAll")
    public String selectAll(){

        System.out.println("调用了UserController的selectAll方法~！~");

        List<User> user =  userService.selectAll();

        System.out.println("user=" + user);

        return "delete success~!~";
    }


    @RequestMapping("findByPage")
    public String selectAll(int pageSize , int pageNumber){

        System.out.println("调用了UserController的selectAll方法~！~");

        PageInfo<User> pageInfo =  userService.findByPage(pageNumber , pageSize);


        List<User> list = pageInfo.getList();

        for(User u :list){
            System.out.println("u===" + u);
        }

      //  System.out.println("List:"+);

        System.out.println("PageNum:"+pageInfo.getPageNum());

        System.out.println("PageSize:"+pageInfo.getPageSize());

        System.out.println("total:"+pageInfo.getTotal());

        System.out.println("size="+pageInfo.getSize());
        return "delete success~!~";
    }
}
