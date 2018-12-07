package com.unknownpeter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public ModelAndView hello() {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("name", "unknown-peter");
        modelView.setViewName("index");
        // modelView.setViewName("/WEB-INF/view/index.jsp");
        return modelView;
    }

}
