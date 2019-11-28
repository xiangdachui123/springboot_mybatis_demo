package com.qf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther xiangjun
 * @Date 2019/11/27
 */
@RestController
@RequestMapping("/stu")
public class StuController {

    @RequestMapping("/list")
    public List stuList(){

        return null;
    }

}
