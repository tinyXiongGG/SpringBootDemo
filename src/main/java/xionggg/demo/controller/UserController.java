package xionggg.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xionggg.demo.dao.UserDao;
import xionggg.demo.entity.User;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description: 关于用户的一些操作，包括注册新增、登录、修改用户信息、用户注销
 * @Author: xw
 * @Date: 2017-08-30 11:12
 */
@RestController
public class UserController {

    @Resource
    private UserDao userDao;

    @RequestMapping("/register")
    public void register(User user){
        userDao.save(user);
    }


}
