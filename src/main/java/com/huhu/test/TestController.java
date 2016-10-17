package com.huhu.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jinliang on 16-10-17.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("foo")
    public String   test(Model model){
        model.addAttribute("name","jinliang");
     System.out.println("Hello World!");
        return "messages/form";
    }
}
