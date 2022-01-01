package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.ResultVo;
import com.example.demo.entity.User;
import com.example.demo.entity.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller


public class IndexController {

//    @PostMapping("/hello")
//    @ResponseBody
//    public Map<String, Object> hello(@RequestBody Map<String,Object> map){
////        serviceimpl.save(uservo);
//        System.out.println(map);
//        return map;
//    }
//
//    @PostMapping("/hello1")
//    @ResponseBody
//    public ResultVo hello1(@RequestBody UserVo vo){
////        serviceimpl.save(uservo);
//        System.out.println(vo);
//        String asc=getString();
//        String string = getString();
//        ResultVo res=new ResultVo();
////        res.setCode(200);
//        res.setResult(vo);
//        return res;
//    }

//    @PostMapping("/hello2")
//    @ResponseBody
//    public ResultVo hello2(@RequestParam int id){
////        serviceimpl.save(uservo);
//
//        String asc=getString();
//        String string = getString();
//        ResultVo res=new ResultVo();
////        res.setCode(200);
//        res.setResult(id);
//        return res;
//    }
    @Autowired
    UserDao userDao;
    @GetMapping("/haha")
    public List<User> saveList(List list){
        List<User> list2=new ArrayList<User>();
        list2.add(new User("tom","boy",19));
        list2.add(new User("jean","girl",23));
        list2.add(new User("joy","boy",22));
        list2.add(new User("jone","boy",28));
        list2.add(new User("maryy","girl",32));
        list2.add(new User("tony","boy",42));
        userDao.saveAll(list);
        return list2;
    }
}
