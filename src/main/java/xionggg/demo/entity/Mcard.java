package xionggg.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:摩卡套卡表
 * @author: xw
 * @date: 2017-09-13 18:22
 */
public class Mcard {
    private Integer id;
    private String name;
    private Integer diff;
    @JSONField(name = "flashTheme")
    private Integer flash;
    private Date time;
    private Integer type;
    private Integer version;
    private String gift;
    private Integer pages;
    private String color;

    @JSONField(name = "cardFrame")
    private List<Card> cards;

    @Override
    public String toString() {
        return "Mcard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", diff=" + diff +
                ", flash=" + flash +
                ", time=" + time +
                ", type=" + type +
                ", version=" + version +
                ", gift='" + gift + '\'' +
                ", pages=" + pages +
                ", color='" + color + '\'' +
                ", cards=" + cards +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDiff() {
        return diff;
    }

    public void setDiff(Integer diff) {
        this.diff = diff;
    }

    public Integer getFlash() {
        return flash;
    }

    public void setFlash(Integer flash) {
        this.flash = flash;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
