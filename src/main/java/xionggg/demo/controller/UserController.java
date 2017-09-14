package xionggg.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xionggg.demo.common.ResultBean;
import xionggg.demo.entity.User;
import xionggg.demo.service.UserService;

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
    private UserService userService;

    @RequestMapping("/register")
    public ResultBean<User> register(User user){
        return new ResultBean<>(userService.save(user));
    }


}
