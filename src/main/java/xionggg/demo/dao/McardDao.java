package xionggg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xionggg.demo.entity.Mcard;

/**
 * Created with IntelliJ IDEA.
 * description :
 * author : xw
 * date : 2017-09-14 17:32
 */
public interface McardDao extends JpaRepository<Mcard,Integer> {

}
