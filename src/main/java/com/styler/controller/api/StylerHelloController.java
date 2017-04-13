package com.styler.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wmjun on 2017. 4. 8..
 */
@RestController
public class StylerHelloController {

    @RequestMapping("/hello")
    public String checkHello(HttpServletRequest httpServletRequest) {
        return "Hello";
    }
}
