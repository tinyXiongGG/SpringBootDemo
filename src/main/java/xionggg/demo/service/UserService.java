package xionggg.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import xionggg.demo.dao.UserDao;
import xionggg.demo.entity.User;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xw
 * @Date: 2017-08-30 14:21
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User save(User user) {
        user.setCreated(new Date());
        user.setUpdated(user.getCreated());
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
        return userDao.save(user);
    }
}
