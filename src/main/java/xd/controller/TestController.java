package xd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mac on 2019/3/13.
 */
@RestController
public class TestController {

    @RequestMapping("/aaa")
    public String test(){
        return "hello!";
    }
}
