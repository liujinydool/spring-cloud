package com.ydool.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {
    @RequestMapping("/getMemberAll")
    public List<String> getMemberAll(){
        List<String> listuser = new ArrayList<String>();
        listuser.add("zhangsan");
        listuser.add("lisi");
        listuser.add("wangwu");

        return  listuser;
    }
}
