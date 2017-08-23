package xionggg.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Author: xw
 * @Date: 2017-08-22 14:39
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message", "随便啊！");
        return "index";
    }
}
