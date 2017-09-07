import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xw
 * @Date: 2017-09-07 16:40
 */
public class Mytest {

    @Test
    public void test(){
        int m = 10;    //总人数
        int n = 3;      //
        int begin = 1;    //


        chooseKing(300, 6, 1);
        System.out.println("===========================");
        yuesefu(300,6,1);
    }

    /**
     *
     * @param m 总人数
     * @param n 每次的数量
     * @param begin 第几个开始报数
     */
    private void chooseKing(int m, int n, int begin) {
        List<Integer> monkeys = new ArrayList<>(m);
        for (int i = 1; i <= m; i++) {
            monkeys.add(i);
        }

        while (monkeys.size()>1){
            int index = begin + n -1;
            while (index > monkeys.size()){
                index = index - monkeys.size();
            }
            index = index -1;
            System.out.println(monkeys+"===="+index);
            monkeys.remove(index);
            begin = index + 1;
        }

        System.out.println(monkeys);
    }

    public void yuesefu(int totalNum, int countNum,int startNO) {
        // 初始化人数
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        //从下标为K开始计数
        int k = startNO-1;
        while (start.size() >0) {
            System.out.println(start);
            //第m人的索引位置
            k = (k + countNum) % (start.size()) - 1;
            // 判断是否到队尾  到队尾时候k=-1
            if (k < 0) {
                start.remove(start.size() - 1);
                k = 0;
            } else {
                start.remove(k);
            }
        }
    }
}
