package cn.zengjiandong.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@RestController
public class HelloController {

    public HelloController() {
        System.out.println("init.......");
    }

    @RequestMapping("/hello")
    public Object hello() {

        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        return map;
    }



}
