package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello";
    }
}
