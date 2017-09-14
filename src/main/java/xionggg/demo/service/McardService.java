package xionggg.demo.service;

import org.springframework.stereotype.Service;
import xionggg.demo.dao.CardDao;
import xionggg.demo.dao.McardDao;
import xionggg.demo.entity.Card;
import xionggg.demo.entity.Mcard;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * description :
 * author : xw
 * date : 2017-09-14 17:29
 */
@Service
public class McardService {

    @Resource
    private McardDao mcardDao;

    @Resource
    private CardDao cardDao;

    public void save(Mcard mcard){
        List<Card> cards = mcard.getCards();

    }
}
