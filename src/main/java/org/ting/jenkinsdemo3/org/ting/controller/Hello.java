package org.ting.jenkinsdemo3.org.ting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sie_zj
 * @create 2020-07-10 11:16
 **/
@RestController
public class Hello {

    @GetMapping("hello")
    public String hello(String name) {
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
