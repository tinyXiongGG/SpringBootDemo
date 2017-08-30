package xionggg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xionggg.demo.entity.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xw
 * @Date: 2017-08-30 14:07
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer>{
}
