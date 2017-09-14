package xionggg.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xionggg.demo.entity.Card;

/**
 * Created with IntelliJ IDEA.
 * description :
 * author : xw
 * date : 2017-09-14 17:39
 */
@Repository
public interface CardDao extends JpaRepository<Card,Integer>{
}
