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

        chooseKing(300, 6, 1);
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


}
