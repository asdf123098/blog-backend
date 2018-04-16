package com.zsj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by zsj on 2018/4/16.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        int i = 9/0;
        return "index";
    }
}
