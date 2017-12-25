package edu.store.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {


    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
