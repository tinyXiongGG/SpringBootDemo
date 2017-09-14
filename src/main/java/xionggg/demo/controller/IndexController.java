package xionggg.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import xionggg.demo.common.ResultBean;
import xionggg.demo.entity.Card;
import xionggg.demo.entity.Mcard;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * author : xw
 * time: 2017-08-22 14:39
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message", "随便啊！");
        return "index";
    }

    @RequestMapping("/mfkp")
    public ResultBean mfkp() throws Exception {
        String url = "https://mfkp.qq.com/cardshow?cmd=theme_info";
        URL u = new URL(url);
        URLConnection conn = u.openConnection();
        conn.setRequestProperty("accept","*/*");
        conn.setRequestProperty("user-agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");
        conn.setRequestProperty("connection","Keep-Alive");

        conn.connect();
        String str =  IOUtils.toString(conn.getInputStream(),"UTF-8").substring(19);
        JSONArray jsonArray = JSON.parseArray(str);
        for (int i = 0; i < jsonArray.size(); i++) {
            Mcard mcard = new Mcard();
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            mcard.setColor(jsonObject.getString("color"));
            mcard.setDiff(jsonObject.getInteger("diff"));
            mcard.setFlash(jsonObject.getInteger("flashTheme"));
            mcard.setGift(jsonObject.getString("gift"));
            mcard.setId(jsonObject.getInteger("id"));
            mcard.setName(jsonObject.getString("name"));
            mcard.setPages(jsonObject.getInteger("pages"));
            mcard.setTime(new Date(jsonObject.getLong("time")));
            mcard.setType(jsonObject.getInteger("type"));
            mcard.setVersion(jsonObject.getInteger("version"));

            JSONArray cardFrame = jsonObject.getJSONArray("cardFrame");
            List<Card> cards = new ArrayList<>();
            for (int j = 0; j < cardFrame.size(); j++) {
                JSONObject object = cardFrame.getJSONObject(i);
                JSONArray JSONCards = object.getJSONArray("cards");
                for (int k = 0; k < JSONCards.size(); k++) {
                    Card card = new Card();
                    card.setMid(mcard.getId());
                    card.setPrice(object.getInteger("price"));
                    card.setTime(object.getInteger("time"));

                    JSONObject o = JSONCards.getJSONObject(i);
                    card.setId(o.getInteger("id"));
                    card.setName(o.getString("name"));
                    card.setFrom(o.getString("from"));

                    cards.add(card);
                }
            }

            mcard.setCards(cards);
        }
        return new ResultBean();
    }
}
